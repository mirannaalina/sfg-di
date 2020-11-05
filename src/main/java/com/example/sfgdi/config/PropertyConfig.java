package com.example.sfgdi.config;

import com.example.sfgdi.examplebeans.FakeDataSource;
import com.example.sfgdi.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import sun.tools.java.Environment;

@Configuration
//@PropertySources({
//        @PropertySource("classpath:datasource.properties"),
//        @PropertySource("classpath:jms.properties")})

public class PropertyConfig {

    @Value("sfgdi.username")
    String username;

    @Value("sfgdi.password")
    String password;

    @Value("sfgdi.dburl")
    String url;

    @Value("sfgdi.jms.username")
    String jmsUername;

    @Value("sfgdi.jms.password")
    String jmsPassword;

    @Value("sfgdi.jms.url")
    String jsmUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker  fakeJmsBroker= new FakeJmsBroker();
        fakeJmsBroker.setJmsUername(jmsUername);
        fakeJmsBroker.setJmsPassword(jmsPassword);
        fakeJmsBroker.setJsmUrl(jsmUrl);
        return fakeJmsBroker;
    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer properties(){
//        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
//        return propertySourcesPlaceholderConfigurer;
//    }

}
