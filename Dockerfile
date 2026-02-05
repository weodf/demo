# 第一阶段：编译 (使用 Maven 镜像)
FROM maven:3.8.5-openjdk-17 AS build
COPY . /app
RUN mvn -f /app/pom.xml clean package -DskipTests

# 第二阶段：运行 (使用最小运行环境)
FROM eclipse-temurin:17-jdk-alpine
COPY --from=build /app/target/*.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]