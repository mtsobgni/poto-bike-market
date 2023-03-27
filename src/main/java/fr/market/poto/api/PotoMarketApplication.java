package fr.market.poto.api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "testSwag", version = "2.0", description = "testSwag"))
public class PotoMarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(PotoMarketApplication.class, args);
    }
}
