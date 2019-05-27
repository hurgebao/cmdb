FROM jdk8:v1
VOLUME /tmp
ARG eureka eureka
ADD cmdb-eureka-0.0.1-SNAPSHOT.jar cmdb-eureka.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=$eureka","-jar","/cmdb-eureka.jar"]
