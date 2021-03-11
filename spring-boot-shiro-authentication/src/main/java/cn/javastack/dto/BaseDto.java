package cn.javastack.dto;

import java.io.Serializable;

/**
 * @author 0164631
 */
public class BaseDto implements Serializable {
    private Integer pageNum;
    private Integer pageSize;
    private String orderByClause;

    public Integer getPageNum() {
        return pageNum==null?1:pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize==null?15:pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }
}
