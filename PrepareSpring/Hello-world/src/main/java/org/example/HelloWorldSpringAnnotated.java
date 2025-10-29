package org.example;

import org.example.messages.config.HelloWorldConfiguration;
import org.example.messages.render.MessageRender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpringAnnotated {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRender mr = ctx.getBean("renderer", MessageRender.class);
        mr.render();
    }
}
