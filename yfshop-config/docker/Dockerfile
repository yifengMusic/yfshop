FROM openjdk:8-jre

MAINTAINER Yifeng <9282207@qq.com>


RUN mkdir /app

COPY yfshop-config-1.0.0-SNAPSHOT.jar /app/app.jar
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/app.jar", "--spring.profiles.active=prod"]

EXPOSE 8888