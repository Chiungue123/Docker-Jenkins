# Base Image 
FROM openjdk:17

# Working Directory inside the Container
WORKDIR /app

# Copy the built jar file into the container
COPY target/simplilearn-01-spring-jdbc-0.0.1-SNAPSHOT.jar /app/my-app.jar

# Command to run the application
CMD ["java", "-jar", "/app/my-app.jar"]