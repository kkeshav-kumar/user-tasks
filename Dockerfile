# Use the official OpenJDK image as a parent image
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file (the Spring Boot application) to the container
COPY . .

# Expose the port your Spring Boot application listens on
EXPOSE 8080

# Define the command to run your Spring Boot application when the container starts
CMD ["java", "-jar", "./build/libs/task-api-0.0.1-SNAPSHOT.jar"]

