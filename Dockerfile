FROM openjdk:24
LABEL authors="salaheddine"

WORKDIR app/

COPY target/restapi-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar","restapi-0.0.1-SNAPSHOT.jar"]