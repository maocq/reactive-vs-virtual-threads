FROM gradle:jdk21-alpine
WORKDIR /app
COPY . .
RUN gradle bootJar


FROM amazoncorretto:21.0.4-alpine3.20
WORKDIR /app
COPY --from=0 /app/build/libs/virtualthreads-0.0.1-SNAPSHOT.jar /app/virtualthreads.jar

ENV JAVA_OPTS="-XX:+UseContainerSupport"
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -jar virtualthreads.jar"]