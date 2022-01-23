package webproject.blagodem.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer{
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/blagodem/choose").setViewName("choose");
//        registry.addViewController("/blagodem/main").setViewName("main");
//        registry.addViewController("/").setViewName("main");
    }
}
