package com.raj.mybazzar.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello world!
 *
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServer 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(ConfigServer.class, args);
    	
    }
}
