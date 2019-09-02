#!/bin/bash
project=cmdb-task
port=8082
PROCESS=`docker ps -a |grep $project |awk '{ print $1 }'|sort|uniq `
#length=${#PROCESS[*] }
##循环删除
for i in $PROCESS
do
  echo rm docker container $i
  docker stop $i
  docker rm $i
done
##
if [ $? -eq 0 ];then
  echo rm $project docker containner ok!
else
  echo rm $project docker containner fall!
fi 

PROCESS=`docker images -a |grep $project |awk '{ print $3 }'|sort|uniq `
#length=${#PROCESS[*] }
##循环删除
for i in $PROCESS
do
  echo rm docker image $i
  docker rmi --force $i
done

if [ $? -eq 0 ];then
  echo rm $project docker images ok!
else
  echo rm $project docker images fall!
fi 

docker pull hub.wts.com/$project
docker run -d -p $port:$port --net=host hub.wts.com/$project


