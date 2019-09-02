#!/bin/bash
project=cmdb-web
project_dir=/home/www/cmdb
PROCESS=`docker images -a |grep $project |awk '{ print $3 }'|sort|uniq `
#length=${#PROCESS[*] }
##循环删除
for i in $PROCESS
do
  echo rm docker image $i
  docker rmi --force $i
done
##
if [ $? -eq 0 ];then
  echo rm $project docker images ok!
else
  echo rm $project docker images fall!
fi 

cd $project_dir/$project
mvn package docker:build

docker tag $project 172.16.4.11:5000/$project
docker push 172.16.4.11:5000/$project
docker images -a |grep $project
