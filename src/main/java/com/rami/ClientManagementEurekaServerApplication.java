package com.rami;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Rami Stefanidis  on 6/25/2017.
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class ClientManagementEurekaServerApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ClientManagementEurekaServerApplication.class, args);
    }
}
