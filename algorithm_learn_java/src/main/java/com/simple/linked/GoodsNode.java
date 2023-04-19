package com.simple.linked;

import lombok.Data;
import lombok.ToString;

/**
 * @Author Simple.Mu
 * @Date 2023/4/10 22:31
 * @Description
 */
@Data
@ToString
public class GoodsNode {

    private int id;
    private String name;
    private double price;

    public GoodsNode next;

    public GoodsNode(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
