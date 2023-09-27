package com.edu.terraDaResistencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TerraDaResistenciaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TerraDaResistenciaProjectApplication.class, args);
	}
	@Bean
	public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
		return factory -> factory.setPort(9090); // Defina a porta desejada aqui
	}

}
