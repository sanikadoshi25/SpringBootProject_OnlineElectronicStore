package com.estore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.util.UrlPathHelper;

@Configuration
public class WebConfig {
    @Bean
    public UrlPathHelper urlPathHelper() {
        UrlPathHelper urlPathHelper = new UrlPathHelper();
        urlPathHelper.setUrlDecode(true); // Ensure Spring decodes parameters
        return urlPathHelper;
    }
}
