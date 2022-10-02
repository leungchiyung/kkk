FROM openjdk:8
VOLUME /tmp
COPY target/kkk-0.0.1-SNAPSHOT.jar demo.jar
RUN bash -c "touch /demo.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"]