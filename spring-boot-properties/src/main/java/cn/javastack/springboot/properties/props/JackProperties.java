package cn.javastack.springboot.properties.props;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 微信公众号：Java技术栈
 */
@Component
@ConfigurationProperties(prefix = "jack")
public class JackProperties {
    private String name;
    private String sex;
    private int age;
    private String country;
    //private Date entryTime;

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

    /*public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Date getEntryTime() {
        return entryTime;
    }*/

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