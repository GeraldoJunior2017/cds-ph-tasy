FROM openjdk:8-jdk
WORKDIR /home/app/cds-ph-tasy
RUN apt update -y && apt upgrade -y \
    && apt install -y maven net-tools \
    && mvn clean compile \
    && mvn package -DskipTests=true \
    && java -jar ./target/cds-ph-tasy-0.0.1-SNAPSHOT.jar
