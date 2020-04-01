# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="usuario@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8090 available to the world outside this container
EXPOSE 8090

#ENV DATABASE_HOST localhost
#ENV DATABASE_PORT 3306
#ENV DATABASE_NAME kaizen
#ENV DATABASE_USER kaizen
#ENV DATABASE_PASSWORD kaizen
#ENV DATABASE_POOL 64

# The application's jar file
ARG JAR_FILE=/target/jenkins-docker.jar

# Add the application's jar to the container
ADD ${JAR_FILE} jenkins-docker.jar

# Run the jar file 
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar","/jenkins-docker.jar"]