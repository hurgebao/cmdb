FROM jdk8:v1
VOLUME /tmp
ADD cmdb-eureka-0.0.1-SNAPSHOT.jar cmdb-eureka.jar
ENV PARAMS=""
ENTRYPOINT java -Dspring.profiles.active=$PARAMS -jar /cmdb-eureka.jar

