FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

# Copia o .jar gerado pelo Maven na etapa 5.1
COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]