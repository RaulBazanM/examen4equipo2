FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY /target/Boss-Final-Eureka-0.0.1-SNAPSHOT.jar Boss-Final-Eureka-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/Boss-Final-Eureka-0.0.1-SNAPSHOT.jar"]