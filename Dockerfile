FROM adoptopenjdk:8-jre-hotspot-focal

RUN mkdir /opt/app
ARG JAR_FILE
COPY ${JAR_FILE} /opt/app/japp.jar
CMD ["java", "-jar", "/opt/app/japp.jar"]