package com.example.testapiweatheryandex.config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigBeanFactory;
import com.typesafe.config.ConfigFactory;

public class TestConfigFactory {
    private final Config config;
    private ApiConfig apiConfig;

    private TestConfigFactory(){
        config = ConfigFactory.systemProperties()
                .withFallback(ConfigFactory.systemEnvironment())
                .withFallback(ConfigFactory.parseResources("test.conf"));
    }

    public ApiConfig getApiConfig(){
        if(apiConfig == null){
            apiConfig = ConfigBeanFactory.create(config.getConfig("apiYandex"), ApiConfig.class);
        }
        return apiConfig;
    }

    public static TestConfigFactory getInstance(){
        return new TestConfigFactory();
    }
}
