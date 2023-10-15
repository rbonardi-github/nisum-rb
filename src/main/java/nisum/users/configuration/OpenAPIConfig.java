package nisum.users.configuration;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;

import java.util.Collections;

import com.google.common.base.Predicates;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SecurityScheme(
        type = SecuritySchemeType.APIKEY,
        name = "Authorization",
        paramName = "Authorization",
        in = SecuritySchemeIn.HEADER)
public class OpenAPIConfig {
    /**
     * Para la cabecera del documento generado par openapi / swagger.
     * Datos generales del servidor, desarrolladores, contacto, etc.
     * @return
     */
    @Bean
    public OpenAPI getOpenApiDefinition(){
        return new OpenAPI()
                .info(new Info()
                        .title("Nisum Application")
                        .version("1.0")
                        .license(new License().name("(C) Copyright Ruben Bonardi").url("https://www.linkedin.com/in/rubenbonardi/"))
                )
                .security(Collections.singletonList(new SecurityRequirement().addList("Authorization")));
    }


}
