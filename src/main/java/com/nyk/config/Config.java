package com.nyk.config;

import lombok.extern.java.Log;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Log
@Configuration
public class Config implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseSuffixPatternMatch(false);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/video/**")
                .addResourceLocations("file:/opt/file/demo/video/");
        registry.addResourceHandler("/pdf/**")
                .addResourceLocations("file:/opt/file/demo/pdf/");
    }
}
