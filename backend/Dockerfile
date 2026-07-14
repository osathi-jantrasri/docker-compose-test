# Stage 1: build jar ด้วย maven
FROM maven:3.9.9-eclipse-temurin-21-alpine AS build
WORKDIR /app
COPY pom.xml ./
COPY src ./src
COPY entrypoint.sh ./
RUN mvn clean package -DskipTests

# Stage 2: run jar ด้วย jre อย่างเดียว (image เล็กลง)
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
COPY --from=build /app/entrypoint.sh ./
RUN chmod +x entrypoint.sh
EXPOSE 8080
ENTRYPOINT ["sh", "entrypoint.sh"]
CMD ["java", "-jar", "app.jar"]