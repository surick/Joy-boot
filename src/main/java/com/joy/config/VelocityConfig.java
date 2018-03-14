package com.joy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.velocity.VelocityConfigurer;
import org.springframework.web.servlet.view.velocity.VelocityViewResolver;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Velocity配置
 *
 */
@Configuration
public class VelocityConfig {

    @Bean
    public VelocityViewResolver velocityViewResolver(){
        VelocityViewResolver viewResolver = new VelocityViewResolver();
        viewResolver.setContentType("text/html;charset=UTF-8");
        viewResolver.setViewNames("*.html");
        viewResolver.setSuffix("");
        viewResolver.setDateToolAttribute("date");
        viewResolver.setNumberToolAttribute("number");
        viewResolver.setToolboxConfigLocation("WEB-INF/velocity-toolbox.xml");
        viewResolver.setRequestContextAttribute("rc");
        viewResolver.setOrder(1);
        return viewResolver;
    }

    @Bean
    public VelocityConfigurer velocityConfigurer() {
        VelocityConfigurer velocityConfigurer = new VelocityConfigurer();
        velocityConfigurer.setResourceLoaderPath("classpath:/views/");
        Map<String,Object> map = new HashMap<>();
        map.put("input.encoding","UTF-8");
        map.put("output.encoding","UTF-8");
        map.put("contentType","text/html;charset=UTF-8");
        velocityConfigurer.setVelocityPropertiesMap(map);
        return velocityConfigurer;
    }
}
