FROM java:8
ADD ./target/netflix-eureka-naming-server.jar netflix-eureka-naming-server.jar
ENTRYPOINT ["java","-jar","netflix-eureka-naming-server.jar"]
EXPOSE 2222