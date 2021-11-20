FROM openjdk:8-jdk-alpine
MAINTAINER "zhangzhaofa"<fa20091001@163.com>
ENV LANG=C.UTF-8 LC_ALL=C.UTF-8
VOLUME /tmp
ADD target/qingyun-shop-order-service.jar app.jar
EXPOSE 10088
ENTRYPOINT    ["java","-jar","-Xms512m","-Xmx1024m","-XX:PermSize=512M","-XX:MaxPermSize=1024M","/app.jar"]