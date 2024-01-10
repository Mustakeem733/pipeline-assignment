FROM eclipse-temurin:17-jdk-alpine
RUN apk add curl
VOLUME /temp
EXPOSE 8084
ADD target/pipeline-0.0.1-SNAPSHOT.jar pipeline-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/pipeline-0.0.1-SNAPSHOT.jar"]
