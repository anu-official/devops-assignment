FROM openjdk:11
EXPOSE 8084
ADD target/devops-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
