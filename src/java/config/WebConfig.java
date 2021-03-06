package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation
        .ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation
        .WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import services.ITaximanager;

import services.Taximanager;


@Configuration
@EnableWebMvc
@ComponentScan("controllers")
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public ITaximanager taximanager() {
        return new Taximanager();
    }

    @Bean
    public ViewResolver viewResolver() {

        InternalResourceViewResolver resolver
                = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**")
                .addResourceLocations("resources/css/");
    }
}
