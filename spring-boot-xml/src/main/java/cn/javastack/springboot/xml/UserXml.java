package cn.javastack.springboot.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.util.List;

/**
 * 微信公众号：Java技术栈
 */
@Data
@JacksonXmlRootElement(localName = "response")
public class UserXml {

    @JacksonXmlProperty(localName = "user_id")
    private String id;

    @JacksonXmlProperty(localName = "user_name")
    private String name;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "order_info")
    private List<OrderInfo> orderList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OrderInfo> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderInfo> orderList) {
        this.orderList = orderList;
    }
}