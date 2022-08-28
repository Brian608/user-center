package com.feather.usercenter;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: user-center
 * @package: com.feather.usercenter
 * @className: FruitManagement
 * @author: feather(杜雪松)
 * @description: TODO
 * @since: 2022/6/26 19:31
 * @version: 1.0
 */
public class FruitManagement {
   static List<Fruit> fruitList=new ArrayList<>();

    public    void insertFruit(Fruit fruit){
        fruitList.add(fruit);
    }

    public   void  show (){
        //总库存
        double totalStock=0;
        //总价格
        double totalPrice = 0;
        System.out.println("---------------查看水果清单---------------");
        System.out.println("水果名称     水果价格（元/每斤）  水果库存（斤）");
        for (Fruit  fruit: fruitList) {
            System.out.println(fruit.getName()+"            "+fruit.getPrice()+"            "+fruit.getStock());
            totalPrice+=fruit.getPrice();
            totalStock+=fruit.getStock();
        }
        System.out.println("总库存"+totalStock+"斤"+"               "+"总价格:"+totalPrice);
    }
}
