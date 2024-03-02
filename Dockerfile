# Use an official lightweight Java image.
# https://hub.docker.com/_/eclipse-temurin/
FROM eclipse-temurin:17-jdk-alpine

# Copy the jar file into the image
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","/app.jar"]

# Expose the port your app runs on
EXPOSE 8080