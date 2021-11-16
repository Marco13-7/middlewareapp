FROM maven:3.8.3-openjdk-17 AS build
RUN mkdir -p /opt/app/src
COPY src /opt/app/src
COPY pom.xml /opt/app
RUN mvn -f /opt/app/pom.xml clean package

FROM eclipse-temurin:17-alpine
RUN mkdir -p /opt/app
COPY --from=build /opt/app/target/middleware-0.0.1-SNAPSHOT.jar /opt/app/middleware-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/opt/app/middleware-0.0.1-SNAPSHOT.jar"]