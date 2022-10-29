FROM openjdk:17
EXPOSE 8080
ADD target/billing-service.jar billing-service.jar
ENTRYPOINT ["java","-jar","/billing-service.jar"]
