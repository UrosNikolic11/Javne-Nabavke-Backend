package rs.raf.ui2021.javnenabavkebackendfebruar.Configuration;


import org.springframework.context.annotation.Bean;


import org.springframework.context.annotation.Configuration;


import rs.raf.ui2021.javnenabavkebackendfebruar.controller.GodisnjiPlanJavnihNabavkiController;
import rs.raf.ui2021.javnenabavkebackendfebruar.controller.KorisnikController;
import rs.raf.ui2021.javnenabavkebackendfebruar.controller.PonudjacContoller;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.JavnaNabavka;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .select().apis(RequestHandlerSelectors.basePackage(PonudjacContoller.class.getPackage().getName()))
                .build()
                .apiInfo(metaData());
    }

    private ApiInfo metaData() {
        return new ApiInfo("API", "API swagger definition", "1.0.0"
                , "Terms of app.service", new Contact("Name", "", "tmp@raf.rs")
                , "", "", Collections.emptyList());
    }

}