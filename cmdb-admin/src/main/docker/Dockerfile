FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD cmdb-admin-0.0.1-SNAPSHOT.jar cmdb-admin.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/cmdb-admin.jar"]