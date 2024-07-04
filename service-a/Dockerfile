# Use a base image with OpenJDK
FROM openjdk:17-jdk-alpine

# Copy the application JAR file to the container
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} service-a.jar

# Expose the port the application runs on
EXPOSE 8081

# Command to run the application
ENTRYPOINT ["java", "-jar", "service-a.jar"]
