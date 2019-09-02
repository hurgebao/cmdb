资产管理系统

hosts文件添加
10.1.35.11 eureka1
10.1.35.12 eureka2
10.1.35.13 eureka3
10.1.35.14 zipkin-server


1、docker运行环境
centos7.5
Docker version 1.13.1, build b2f74b2/1.13.1
1.8.0_131

2、生成docker镜像
cd  cmdb-admin
mvn package docker:build
cd  cmdb-cureka
mvn package docker:build

3、运行docker
docker run -d -p 8888:8888 --net=host cmdb/cmdb-admin
docker run -d -p 8761:8761 -e PARAMS=eureka1 --net=host cmdb/cmdb-eureka
docker run -d -p 8762:8762 -e PARAMS=eureka2 --net=host cmdb/cmdb-eureka
docker run -d -p 8763:8763 -e PARAMS=eureka3 --net=host cmdb/cmdb-eureka

admin
http://10.1.35.11:8888/

eureka访问地址
http://eureka1:8761/
http://eureka2:8762/
http://eureka3:8763/

zipkin-dashboard访问地址
http://zipkin-server:17601/

gateway访问地址
http://172.16.4.13:8080/swagger-ui.html

firewall-cmd --zone=public --add-port=8762/tcp --permanent