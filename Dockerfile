# use java 21 as base 
FROM eclipse-temurin:21

# Set port -- # TODO
EXPOSE 4200

# Set working directory in the container
WORKDIR /hello

# Copy POM to the container 
COPY pom.xml .

COPY /target/hello-0.1-SNAPSHOT.jar .

# Copy the code to the container 
COPY src src

# Build application with Maven
# RUN ./mvnw install -DskipTests

# startup command to run the Spring Boot application
CMD ["java", "-jar", "hello-0.1-SNAPSHOT.jar"]
