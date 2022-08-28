package com.feather.usercenter;

/**
 * @projectName: user-center
 * @package: com.feather.usercenter
 * @className: Fruit
 * @author: feather(杜雪松)
 * @description: TODO
 * @since: 2022/6/26 19:29
 * @version: 1.0
 */
public class Fruit {
    /**
     * 名称
     */
    private String name;
    /**
     * 价格
     */
    private Double price;
    /**
     * 库存
     */
    private  Double  stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }

    public Fruit(String name, Double price, Double stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}
