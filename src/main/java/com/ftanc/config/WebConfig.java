package com.ftanc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by ftanc on 11/10/2016.
 */
@Configuration
public class WebConfig {
    @Bean
    public WebMvcConfigurerAdapter forwardToIndex(){
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry){
                registry.addViewController("/").setViewName(
                        "forward:/public/index.html"
                );
            }
        };
    }
}
