package com.wicho.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}

/*
 * Para habilitar el servidor Eureka es necesario importar dos dependencias:
 * Eureka Discovery client y Eureka Server
 * despues solo se agrega la anotacion @EnableEurekaServer en la aplicacion
 * principal y se configura el archivo application.properties, ya que el
 * servicio Eureka puede actuar como servidor o cliente
*/