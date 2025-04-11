FROM eclipse-temurin:17-jre

RUN mkdir /opt/app
ARG JAR_FILE
COPY ${JAR_FILE} /opt/app/japp.jar
CMD ["java", "-jar", "/opt/app/japp.jar"]
