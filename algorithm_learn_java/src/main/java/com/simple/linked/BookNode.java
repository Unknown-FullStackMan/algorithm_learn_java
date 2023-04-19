package com.simple.linked;

import lombok.Data;
import lombok.ToString;

/**
 * @Author Simple.Mu
 * @Date 2023/4/11 20:44
 * @Description
 */
@Data
public class BookNode {
    private int id;

    private String name;

    private double price;

    public BookNode(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    /**
     * 直接后继节点
     */
    public BookNode next;
    /**
     * 直接前驱节点
     */
    public BookNode pre;
}
