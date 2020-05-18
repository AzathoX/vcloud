FROM docker.io/relateiq/oracle-java8
VOLUME /tmp
ADD target/vcloud.jar vcloud.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/vcloud.jar"]
EXPOSE 8088