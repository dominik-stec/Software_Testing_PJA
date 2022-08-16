FROM ubuntu:20.04
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN apt update
RUN apt -y install maven
RUN mvn clean test