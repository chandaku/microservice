FROM alpine-jdk:base
MAINTAINER javaonfly
RUN apk --no-cache add netcat-openbsd
COPY MicroServiceClient/build/libs/MicroServiceClient*.jar /opt/lib/MicroServiceClient.jar
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/lib/MicroServiceClient.jar"]
EXPOSE 8080

