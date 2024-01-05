# Base Image 
FROM openjdk:17

# Working Directory inside the Container
WORKDIR /app

# Copy the wait-for-it script into the container and make it executable
COPY wait-for-it.sh /wait-for-it.sh
RUN chmod +x /wait-for-it.sh

# Copy the built jar file into the container
# Using a wildcard to avoid specifying the version in the Dockerfile
COPY target/demo-0.0.1-SNAPSHOT.jar /app/my-app.jar

# Command to run the application
CMD ["java", "-jar", "/app/my-app.jar"]