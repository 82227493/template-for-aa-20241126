# BaseImage 설정
FROM cepgbaseacr.azurecr.io/docker.io/openjdk:17-slim

# 애플리케이션 JAR 파일을 컨테이너에 복사
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# 컨테이너가 시작될 때 실행될 명령어 설정
ENTRYPOINT ["java", "-jar", "/app.jar"]
