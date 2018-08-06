FROM alpine-jdk:base
MAINTAINER javaonfly
COPY target/MicroServiceGateway*.jar /opt/lib/MicroServiceGateway.jar
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/lib/MicroServiceGateway.jar"]
EXPOSE 8084