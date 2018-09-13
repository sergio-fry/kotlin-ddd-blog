FROM openjdk:8-jdk

WORKDIR /app
COPY . .
RUN ./gradlew build