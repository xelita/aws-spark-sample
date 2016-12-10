FROM openjdk:8-alpine

VOLUME /tmp

ADD target/aws-spark-sample-*.jar /app.jar
RUN chmod +x /app.jar

EXPOSE 4567
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
