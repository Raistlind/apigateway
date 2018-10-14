package cn.krynn.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 跨域配置
 * C - Cross, O - Origin, R - Resource, S - Sharing
 * Created by RaistlinD
 * 2018/10/14 1:48 PM
 */
@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {

        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        final CorsConfiguration config = new CorsConfiguration();

        config.setAllowCredentials(true);
        config.setAllowedOrigins(Arrays.asList("*")); //www.abc.com
        config.setAllowedHeaders(Arrays.asList("*"));
        config.setAllowedMethods(Arrays.asList("*"));
        config.setMaxAge(300l);

        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
