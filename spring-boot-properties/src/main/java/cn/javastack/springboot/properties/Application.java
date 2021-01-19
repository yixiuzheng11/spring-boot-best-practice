package cn.javastack.springboot.properties;

import cn.javastack.springboot.properties.props.JackProperties;
import cn.javastack.springboot.properties.props.RedProperties;
import cn.javastack.springboot.properties.props.TomProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * 微信公众号：Java技术栈
 */
@SpringBootApplication
@EnableConfigurationProperties({TomProperties.class})
public class Application {
    @Autowired
    private TomProperties tomProperties;
    @Autowired
    private JackProperties jackProperties;
    @Autowired
    private RedProperties redProperties;

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return (args) -> {
            System.out.println(tomProperties);
            System.out.println(jackProperties);
            System.out.println(redProperties);
        };
    }


}
