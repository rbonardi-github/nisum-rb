# Nisum - Crud de Usuarios con seguridad JWT

![](https://img.shields.io/badge/build-success-brightgreen.svg)

# Stack Tecnológico

![](https://img.shields.io/badge/java_11-✓-blue.svg)
![](https://img.shields.io/badge/spring_boot-✓-blue.svg)
![](https://img.shields.io/badge/h2_database-✓-blue.svg)
![](https://img.shields.io/badge/jwt-✓-blue.svg)
![](https://img.shields.io/badge/openapi_3-✓-blue.svg)

# Resumen

Servicio para el alta, eliminación y consulta de usuarios, así como su logueo para no permitir peticiones inseguras.
![](./doc/Diagrama-Flujo.jpg) 

# Diagrama de componentes

![](./doc/Diagrama-componentes.jpg)

# Iniciar el servicio

1. Requsitos: [Java 11](https://www.java.com/download/) y [Maven](https://maven.apache.org)

2. Clonar el repositorio

```
$ git clone https://github.com/rbonardi-github/nisum-rb.git
```

3. Posicionarse en la carpeta

```
$ cd nisum-rb
```

4. Compilación e instalación de dependencias

```
$ mvn clean package
```

5. Arranque del servicio

```
$ mvn spring-boot:run
```

```javascript
[INFO] Attaching agents: []

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::               (v2.6.13)

2023-10-16 10:11:01.825  INFO 15548 --- [           main] com.nisum.users.ServiceApplication       : Starting ServiceApplication using Java 11.0.12 on DESKTOP-TKEKVBL with PID 15548 (C:\Nisum\
entrevista\nisum-rb\target\classes started by ruben in C:\Nisum\entrevista\nisum-rb)
2023-10-16 10:11:01.829  INFO 15548 --- [           main] com.nisum.users.ServiceApplication       : The following 1 profile is active: "local"
2023-10-16 10:11:02.510  INFO 15548 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2023-10-16 10:11:02.563  INFO 15548 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 46 ms. Found 1 JPA repository interfaces.
2023-10-16 10:11:03.489  INFO 15548 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2023-10-16 10:11:03.498  INFO 15548 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-10-16 10:11:03.499  INFO 15548 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.68]
2023-10-16 10:11:03.700  INFO 15548 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-10-16 10:11:03.700  INFO 15548 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1812 ms
2023-10-16 10:11:03.733  INFO 15548 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2023-10-16 10:11:03.837  INFO 15548 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2023-10-16 10:11:03.848  INFO 15548 --- [           main] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:nisum_db'
2023-10-16 10:11:03.945  INFO 15548 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2023-10-16 10:11:03.988  INFO 15548 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.6.12.Final
2023-10-16 10:11:04.094  INFO 15548 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2023-10-16 10:11:04.175  INFO 15548 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2023-10-16 10:11:04.718  INFO 15548 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform
.internal.NoJtaPlatform]
2023-10-16 10:11:04.726  INFO 15548 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2023-10-16 10:11:05.101  WARN 15548 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed
 during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2023-10-16 10:11:05.275  WARN 15548 --- [           main] o.s.s.c.a.web.builders.WebSecurity       : You are asking Spring Security to ignore Ant [pattern='/v3/api-docs']. This is not recommen
ded -- please use permitAll via HttpSecurity#authorizeHttpRequests instead.
2023-10-16 10:11:05.276  INFO 15548 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will not secure Ant [pattern='/v3/api-docs']
2023-10-16 10:11:05.276  WARN 15548 --- [           main] o.s.s.c.a.web.builders.WebSecurity       : You are asking Spring Security to ignore Ant [pattern='/v3/api-docs/**']. This is not recom
mended -- please use permitAll via HttpSecurity#authorizeHttpRequests instead.
2023-10-16 10:11:05.277  INFO 15548 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will not secure Ant [pattern='/v3/api-docs/**']
2023-10-16 10:11:05.277  WARN 15548 --- [           main] o.s.s.c.a.web.builders.WebSecurity       : You are asking Spring Security to ignore Ant [pattern='/swagger-resources/**']. This is not
 recommended -- please use permitAll via HttpSecurity#authorizeHttpRequests instead.
2023-10-16 10:11:05.278  INFO 15548 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will not secure Ant [pattern='/swagger-resources/**']
2023-10-16 10:11:05.279  WARN 15548 --- [           main] o.s.s.c.a.web.builders.WebSecurity       : You are asking Spring Security to ignore Ant [pattern='/swagger-ui.html']. This is not reco
mmended -- please use permitAll via HttpSecurity#authorizeHttpRequests instead.
2023-10-16 10:11:05.280  INFO 15548 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will not secure Ant [pattern='/swagger-ui.html']
2023-10-16 10:11:05.280  WARN 15548 --- [           main] o.s.s.c.a.web.builders.WebSecurity       : You are asking Spring Security to ignore Ant [pattern='/swagger-ui/**']. This is not recomm
ended -- please use permitAll via HttpSecurity#authorizeHttpRequests instead.
2023-10-16 10:11:05.281  INFO 15548 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will not secure Ant [pattern='/swagger-ui/**']
2023-10-16 10:11:05.281  WARN 15548 --- [           main] o.s.s.c.a.web.builders.WebSecurity       : You are asking Spring Security to ignore Ant [pattern='/configuration/**']. This is not rec
ommended -- please use permitAll via HttpSecurity#authorizeHttpRequests instead.
2023-10-16 10:11:05.281  INFO 15548 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will not secure Ant [pattern='/configuration/**']
2023-10-16 10:11:05.281  WARN 15548 --- [           main] o.s.s.c.a.web.builders.WebSecurity       : You are asking Spring Security to ignore Ant [pattern='/webjars/**']. This is not recommend
ed -- please use permitAll via HttpSecurity#authorizeHttpRequests instead.
2023-10-16 10:11:05.281  INFO 15548 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will not secure Ant [pattern='/webjars/**']
2023-10-16 10:11:05.282  WARN 15548 --- [           main] o.s.s.c.a.web.builders.WebSecurity       : You are asking Spring Security to ignore Ant [pattern='/public']. This is not recommended -
- please use permitAll via HttpSecurity#authorizeHttpRequests instead.
2023-10-16 10:11:05.282  INFO 15548 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will not secure Ant [pattern='/public']
2023-10-16 10:11:05.282  WARN 15548 --- [           main] o.s.s.c.a.web.builders.WebSecurity       : You are asking Spring Security to ignore Ant [pattern='/h2-console/**']. This is not recomm
ended -- please use permitAll via HttpSecurity#authorizeHttpRequests instead.
2023-10-16 10:11:05.283  INFO 15548 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will not secure Ant [pattern='/h2-console/**']
2023-10-16 10:11:05.324  INFO 15548 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will secure any request with [org.springframework.security.web.context.request.async.WebAsy
ncManagerIntegrationFilter@3538a129, org.springframework.security.web.context.SecurityContextPersistenceFilter@177302d6, org.springframework.security.web.header.HeaderWriterFilter@8c34631, org
.springframework.security.web.authentication.logout.LogoutFilter@2213854b, com.nisum.users.security.JwtTokenFilter@766db6f9, org.springframework.security.web.savedrequest.RequestCacheAwareFilt
er@21046afa, org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter@41bbdd8a, org.springframework.security.web.authentication.AnonymousAuthenticationFilter@6f8fb90
6, org.springframework.security.web.session.SessionManagementFilter@3aa63b53, org.springframework.security.web.access.ExceptionTranslationFilter@4a094f90, org.springframework.security.web.acce
ss.intercept.FilterSecurityInterceptor@742dbac8]
2023-10-16 10:11:05.824  INFO 15548 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2023-10-16 10:11:05.834  INFO 15548 --- [           main] com.nisum.users.ServiceApplication       : Started ServiceApplication in 4.42 seconds (JVM running for 4.894)

```

# Acceso a consolas

Una vez iniciado el servicio puede acceder a las consolas:

1. Consola OpenApi

`http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/` 

2.- Consola Base de Datos H2

Usuario: root
Password: root
BD: nisum_db

![](./doc/bd.jpg)


# Prueba servicio

Una vez iniciado el servicio puede acceder a las consolas:

1. Operación `POST /users/signup`

Request ROLE_ADMIN

```
{
  "name": "Ruben Bonardi - Admin",
  "username": "arbonardi",
  "email": "ruben.bonardi@gmail.com.cl",
  "password": "arbonardi",
  "phones": [
    {
      "numberPhone": "+541130698383",
      "cityCode": "BUE",
      "countryCode": "AR"
    }
  ],
  "appUserRoles": [
    "ROLE_ADMIN"
  ]
}
```

Request ROLE_CLIENT

```
{
  "name": "Ruben Bonardi - Client",
  "username": "crbonardi",
  "email": "ruben_bonardi@hotmail.com.cl",
  "password": "crbonardi",
  "phones": [
    {
      "numberPhone": "+541130698383",
      "cityCode": "BUE",
      "countryCode": "AR"
    }
  ],
  "appUserRoles": [
    "ROLE_CLIENT"
  ]
}
```

Ejecución

```
curl -X 'POST' \
  'http://localhost:8080/users/signup' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "name": "Ruben Bonardi - Admin",
  "username": "arbonardi",
  "email": "ruben.bonardi@gmail.com.cl",
  "password": "arbonardi",
  "phones": [
    {
      "numberPhone": "+541130698383",
      "cityCode": "BUE",
      "countryCode": "AR"
    }
  ],
  "appUserRoles": [
    "ROLE_ADMIN"
  ]
}'
```

Respuesta

```
{
  "id": 1,
  "uuid": "2b235246-768c-476c-a07d-eb709382d1cf",
  "name": "Ruben Bonardi - Admin",
  "username": "arbonardi",
  "email": "ruben.bonardi@gmail.com.cl",
  "isActive": true,
  "createdDate": "2023-10-16",
  "modifyDate": "2023-10-16",
  "lastLogin": "2023-10-16",
  "phones": [
    {
      "numberPhone": "+541130698383",
      "cityCode": "BUE",
      "countryCode": "AR"
    }
  ],
  "appUserRoles": [
    "ROLE_ADMIN"
  ],
  "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhcmJvbmFyZGkiLCJhdXRoIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpYXQiOjE2OTc0NjY3OTMsImV4cCI6MTY5NzQ2NzA5M30.psYAsqOYcJFl5yWC07RUYQqujigHlilv94tOMpgkrEk"
}
```

2. Operación `POST /users/signin`

Esta operación realiza el login para el usario conectado.

Nota: el token obtenido al crear (operacion 1) o realizar login (operacion 2) debe colocarse en el "Authorize" anteponiendo el literal "Bearer".

![](./doc/authorize.jpg)

Ejecución
```
curl -X 'POST' \
  'http://localhost:8080/users/signin?username=arbonardi&password=arbonardi' \
  -H 'accept: */*' \
  -d ''
```
Respuesta
```
eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhcmJvbmFyZGkiLCJhdXRoIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpYXQiOjE2OTc0NjcyNzgsImV4cCI6MTY5NzQ2NzU3OH0.CPfk6cHLoZX8dD298wCSy-Ueq2-Nk9Qt1DPRsf_CBhY
```

3. Operación `GET /users/me`

Recupera la información del usuario logueado

Ejecución
```
curl -X 'GET' \
  'http://localhost:8080/users/me' \
  -H 'accept: */*' \
  -H 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhcmJvbmFyZGkiLCJhdXRoIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpYXQiOjE2OTc0Njc0NTIsImV4cCI6MTY5NzQ2Nzc1Mn0.47e5nMmlHz-gpfar5gpTybOjUaG-IPX_8N2SbZ6_r7M'
```
Respuesta
```
{
  "id": 1,
  "uuid": "2b235246-768c-476c-a07d-eb709382d1cf",
  "name": "Ruben Bonardi - Admin",
  "username": "arbonardi",
  "email": "ruben.bonardi@gmail.com.cl",
  "isActive": true,
  "createdDate": "2023-10-16",
  "modifyDate": "2023-10-16",
  "lastLogin": "2023-10-16",
  "phones": [
    {
      "numberPhone": "+541130698383",
      "cityCode": "BUE",
      "countryCode": "AR"
    }
  ],
  "appUserRoles": [
    "ROLE_ADMIN"
  ],
  "token": null
}
```

4. Operación `GET /users/{username}`

Recupera la información de un usuario. Solo puede ser llamao con un usuario con ROLE_ADMIN

Ejecución
```
curl -X 'GET' \
  'http://localhost:8080/users/arbonardi' \
  -H 'accept: */*' \
  -H 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhcmJvbmFyZGkiLCJhdXRoIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpYXQiOjE2OTc0Njc0NTIsImV4cCI6MTY5NzQ2Nzc1Mn0.47e5nMmlHz-gpfar5gpTybOjUaG-IPX_8N2SbZ6_r7M'
```
Respuesta
```
{
  "id": 1,
  "uuid": "2b235246-768c-476c-a07d-eb709382d1cf",
  "name": "Ruben Bonardi - Admin",
  "username": "arbonardi",
  "email": "ruben.bonardi@gmail.com.cl",
  "isActive": true,
  "createdDate": "2023-10-16",
  "modifyDate": "2023-10-16",
  "lastLogin": "2023-10-16",
  "phones": [
    {
      "numberPhone": "+541130698383",
      "cityCode": "BUE",
      "countryCode": "AR"
    }
  ],
  "appUserRoles": [
    "ROLE_ADMIN"
  ],
  "token": null
}
```

5. Operación `GET /users/refresh`

Refresca el token del usuario logueado.

Ejecución
```
curl -X 'GET' \
  'http://localhost:8080/users/refresh' \
  -H 'accept: */*' \
  -H 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhcmJvbmFyZGkiLCJhdXRoIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpYXQiOjE2OTc0Njc0NTIsImV4cCI6MTY5NzQ2Nzc1Mn0.47e5nMmlHz-gpfar5gpTybOjUaG-IPX_8N2SbZ6_r7M'
```
Respuesta
```
eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhcmJvbmFyZGkiLCJhdXRoIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpYXQiOjE2OTc0Njc2MzIsImV4cCI6MTY5NzQ2NzkzMn0.sh8T7suEY7vdr0FisHZtzUOicVK_wrVYbaPF1OMrHX4
```

6. Operación `DELETE /users/{username}`

Elimina un usuario. Solo puede ser llamao con un usuario con ROLE_ADMIN

Ejecución
```
curl -X 'DELETE' \
  'http://localhost:8080/users/arbonardi' \
  -H 'accept: */*' \
  -H 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhcmJvbmFyZGkiLCJhdXRoIjpbeyJhdXRob3JpdHkiOiJST0xFX0FETUlOIn1dLCJpYXQiOjE2OTc0Njc3MTcsImV4cCI6MTY5NzQ2ODAxN30.WneqxdCbMuw8JxgJZQH6zHY1naC22vmiD87H_PPJNs4'
```
Respuesta
```
arbonardi
```