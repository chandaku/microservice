FROM alpine-jdk:base
MAINTAINER javaonfly
RUN apk --no-cache add netcat-openbsd
COPY build/libs/MicroServiceClientDashBoard*.jar /opt/lib/MicroServiceClientDashBoard.jar
COPY entrypoint.sh /opt/bin/entrypoint.sh
RUN chmod 755 /opt/bin/entrypoint.sh
EXPOSE 8080