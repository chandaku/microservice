FROM alpine-jdk:base
MAINTAINER javaonfly
COPY /EurekaNetflixRegistryServer/build/libs/EurekaNetflixRegistryServer*.jar /opt/lib/EurekaNetflixRegistryServer.jar
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/lib/EurekaNetflixRegistryServer.jar"]
EXPOSE 9091

