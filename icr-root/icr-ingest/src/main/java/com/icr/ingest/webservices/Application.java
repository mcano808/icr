
package com.icr.ingest.webservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application extends SpringBootServletInitializer
{

    public static void main(String[] args)
    {
	ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
//	RepositoryRestConfiguration restConfiguration = ctx.getBean(RepositoryRestConfiguration.class);
//
//	restConfiguration.setReturnBodyOnCreate(true);
//	restConfiguration.setReturnBodyOnUpdate(true);
    }
}
