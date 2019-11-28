package com.pratian.netflixeurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflixEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaNamingServerApplication.class, args);
	}

}


/*
Naming server
	Ribbon will distribute load across the clients
	Based on load decrease/increase 
	when ever Micro-service comes  the microservices  would register with the naming server
	when ever one service wants to talk with another server direct it would ask the  naming server what are the instances of the services available
	this is called service discovery
	
	Two imp feature of the naming server
	1. Service registration 
	2. Service discovery
*
*/