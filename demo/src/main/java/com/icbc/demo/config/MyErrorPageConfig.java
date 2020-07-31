package com.icbc.demo.config;

import org.springframework.boot.web.server.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class MyErrorPageConfig {

    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer(){
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                ErrorPage errorPage1 = new ErrorPage(HttpStatus.NOT_FOUND, "/page/error/4xx.html");
//                ErrorPage errorPage2 = new ErrorPage(HttpStatus.NOT_FOUND, "/page/error/5xx.html");
                factory.addErrorPages(errorPage1);
            }
        };
    }
}
