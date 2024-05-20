FROM openjdk:17.0-jdk-slim-bullseye
COPY "./target/gardrobe_app-1.0-SNAPSHOT.jar" "/application/app.jar"
EXPOSE 8082
CMD ["java", "-jar", "/application/app.jar"]