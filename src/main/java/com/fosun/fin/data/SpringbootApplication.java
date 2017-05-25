package com.fosun.fin.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

/**
 * Created by Administrator on 2017/5/2.
 */
@SpringBootApplication
public class SpringbootApplication implements EmbeddedServletContainerCustomizer{

    public static void main(String[] args){

        SpringApplication.run(SpringbootApplication.class,args);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        configurableEmbeddedServletContainer.setPort(8888);
    }
}
