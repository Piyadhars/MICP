# Use an official Maven runtime as a parent image
FROM maven:3.8.1-openjdk-8-slim AS build

# Set the working directory to /app
WORKDIR /app

# Copy the pom.xml and source code to the container
COPY pom.xml .
COPY src ./src


#Change JDBC URL

#RUN sed -i 's/jdbc:postgresql:\/\/localhost:5433\/postgres/jdbc:postgresql:\/\/mic-p-dev-rds-01.catqnk6wylpy.ap-south-1.rds.amazonaws.com:5432\/postgres/g' /app/src/main/resources/application.yml

# Build the application with Maven
# RUN mvn package
# RUN mvn install
RUN mvn install

# Use an official OpenJDK runtime as a parent image
FROM openjdk:8u292-jre-slim

# Set the working directory to /app
WORKDIR /app

# Copy the JAR file from the build stage to the container
COPY --from=build /app/target/*.jar Spring.jar

# Run the application when the container starts
CMD ["java", "-jar", "Spring.jar"]
