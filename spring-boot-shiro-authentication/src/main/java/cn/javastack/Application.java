package cn.javastack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 微信公众号：Java技术栈
 */
@SpringBootApplication
@MapperScan("cn.javastack.mapper")
public class Application {
    public static void main(String[] args) {
        //new SpringApplicationBuilder(Application.class).bannerMode(Banner.Mode.CONSOLE).run(args);
        SpringApplication.run(Application.class, args);
    }
}
