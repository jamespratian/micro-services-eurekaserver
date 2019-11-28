FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} netflix-eureka-naming-server.jar
ENTRYPOINT ["java","-jar","/netflix-eureka-naming-server.jar"]
