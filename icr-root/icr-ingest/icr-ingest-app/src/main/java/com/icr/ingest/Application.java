
package com.icr.ingest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.icr.ingest.db.MongodbMigrator;
import com.icr.ingest.webservices.nifi.NifiRestHandler;
import com.icr.ingest.webservices.nifi.common.NifiRestUtils;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class Application extends SpringBootServletInitializer implements CommandLineRunner
{
    @Autowired
    private MongodbMigrator migrator;

    public static void main(String[] args)
    {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        NifiRestHandler handler = context.getBean(NifiRestHandler.class);
        Environment env = context.getBean(Environment.class);
        new NifiRestUtils(handler, env.getProperty("nifi.server")).uploadTemplates();
    }

    @Override
    public void run(String... args) throws Exception
    {
        migrator.runMigrate();
    }

    @Bean
    public WebMvcConfigurer corsConfigurer()
    {
        return new WebMvcConfigurerAdapter()
        {
            @Override
            public void addCorsMappings(CorsRegistry registry)
            {
                registry.addMapping("/ingestJobs").allowedOrigins("http://localhost:9000");
            }
        };
    }
}
