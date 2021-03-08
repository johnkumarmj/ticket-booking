package com.ticket.booking.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
public class TilecConfig {

@Bean
@Primary
    public UrlBasedViewResolver getviewreResolver(){
    UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
    viewResolver.setViewClass(TilesView.class);
    return viewResolver;
}

@Bean
    public TilesConfigurer getTilesConfigurer(){
    TilesConfigurer tilesConfigurer = new TilesConfigurer();
    tilesConfigurer.setDefinitions("classpath:bookin-tiles-def.xml");
    tilesConfigurer.setCheckRefresh(true);
    return tilesConfigurer;
}
}
