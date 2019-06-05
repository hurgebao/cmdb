cd cmdb-stub
mvn clean deploy

cd cmdb-eureka
mvn package docker:build

cd cmdb-zipkin-dashboard
mvn package docker:build

cd cmdb-task
mvn package docker:build

cd cmdb-web
mvn package docker:build