FROM openjdk:11

EXPOSE 8080

ADD target/library-management-service.jar library-management-service.jar

ENTRYPOINT ["java","-jar","library-management-service.jar"]
