package br.com.mv.cdsphtasy;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "CDS-PH-TASY", version = "1.0.0"))
public class CdsPhTasyApplication {

    public static void main(String[] args) {
        SpringApplication.run(CdsPhTasyApplication.class, args);
    }
}
