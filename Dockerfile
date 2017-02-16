#java -jar target/credgenerator-1.0.0-SNAPSHOT.jar

FROM openjdk:8-jre-alpine

ADD target/credgenerator-1.0.0-SNAPSHOT.jar /

EXPOSE 8080

WORKDIR /

ENTRYPOINT ["java", "-jar", "credgenerator-1.0.0-SNAPSHOT.jar"]
