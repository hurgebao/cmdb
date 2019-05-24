#!/bin/bash
procc=cmdb-admin
PROCESS=`ps -ef|grep $procc|grep -v grep|grep -v PPID|awk '{ print $2}'`
for i in $PROCESS
do
  echo "Kill the $procc process [ $i ]"
  kill -9  $i
done


