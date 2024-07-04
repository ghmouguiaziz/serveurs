FROM openjdk:17-alpine
EXPOSE 8093
ADD target/serveurs-0.0.1-SNAPSHOT.jar serveurs.jar
ENTRYPOINT ["java","-jar","serveurs.jar"]
