# Use a base image with OpenJDK
FROM openjdk:17-jdk-alpine

# Copy the application JAR file to the container
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} service-b.jar

# Expose the port the application runs on
EXPOSE 8082

# Command to run the application
ENTRYPOINT ["java", "-jar", "service-b.jar"]
