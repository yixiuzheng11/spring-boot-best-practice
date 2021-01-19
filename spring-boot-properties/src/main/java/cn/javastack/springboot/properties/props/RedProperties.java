package cn.javastack.springboot.properties.props;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 微信公众号：Java技术栈
 */
@Configuration
public class RedProperties {
    @Value("${red.name}")
    private String name;
    @Value("${red.sex}")
    private String sex;
    @Value("${red.age}")
    private int age;
    @Value("深圳")
    private String country;

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "TomProperties{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                //", entryTime=" + entryTime +
                '}';
    }

}