FROM java:8
ADD ./target/netflix-eureka-naming-server-0.0.1-SNAPSHOT netflix-eureka-naming-server-0.0.1-SNAPSHOT
ENTRYPOINT ["java","-jar","netflix-eureka-naming-server-0.0.1-SNAPSHOT"]
EXPOSE 8000
