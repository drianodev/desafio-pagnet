FROM eclipse-temurin:21-jdk-jammy
VOLUME /tmp
COPY . .
RUN ./mvnw clean install -DskipTests
ENTRYPOINT ["java","-jar","target/desafio-backend-pagnet-0.0.1-SNAPSHOT.jar"]