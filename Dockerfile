FROM openjdk:12
EXPOSE 8082
COPY target/*.jar alpha.jar
ENTRYPOINT ["java","-jar","/alpha.jar"]
