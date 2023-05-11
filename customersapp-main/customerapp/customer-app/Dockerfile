FROM openjdk:17-jdk
RUN mkdir app
COPY src/main/resources/data.json src/main/resources/data.json
COPY target/customer-app-*.jar app/app.jar
CMD ["java","-jar","/app/app.jar"]
