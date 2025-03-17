# Spring-OAuth2-Login
Spring 3.0.5 ver. Social OAuth2 Login with Google and github  

# Manual
- spring_social의 이름을 가진 DB를 구축합니다.
```mysql
mysql> create database spring_social;
```

- 코드는 application.properties의 설정 파일만 수정하여 사용하시면 됩니다.
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/spring_social?characterEncoding=UTF-8&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=1234

spring.security.oauth2.client.registration.google.client-id={client-id}
spring.security.oauth2.client.registration.google.client-secret={client-secret}
spring.security.oauth2.client.registration.google.redirect-uri=http://localhost:8080/oauth2/callback/google
spring.security.oauth2.client.registration.google.scope=email,profile

spring.security.oauth2.client.registration.github.client-id={client-id}
spring.security.oauth2.client.registration.github.client-secret={client-secret}
spring.security.oauth2.client.registration.github.redirect-uri=http://localhost:8080/oauth2/callback/github
spring.security.oauth2.client.registration.github.scope=user:email,read:user
```

# Caution  
- 이 코드는 백엔드 코드로써 동작합니다.
  - 따라서, 전체 과정을 테스트 하기 위해서는 프론트 코드를 필요로 합니다.
  - 같은 장치에서 서버를 돌릴때, 프론트에서 접근 방식은 다음과 같습니다.
    -  로그인시 : http://localhost:8080/oauth2/authorization/{registrationId}?redirect_uri=http://localhost:3000/oauth2/redirect
    -  리다이렉션시 jwtToken을 저장하는 로직이 필요합니다.
