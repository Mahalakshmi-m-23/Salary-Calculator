FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# Make sure the jar name matches artifactId and version in pom.xml
COPY target/salary-calculator-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]