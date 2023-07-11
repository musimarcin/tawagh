FROM openjdk:17
WORKDIR /Nowy
COPY target/Nowy-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]