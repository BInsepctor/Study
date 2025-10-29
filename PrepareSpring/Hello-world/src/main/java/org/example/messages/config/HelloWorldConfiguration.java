package org.example.messages.config;

import org.example.messages.provider.HelloWorldMessageProvider;
import org.example.messages.provider.MessageProvider;
import org.example.messages.render.MessageRender;
import org.example.messages.render.StandartOutMessageRender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }
    @Bean
    public MessageRender renderer() {
        MessageRender renderer = new StandartOutMessageRender();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
