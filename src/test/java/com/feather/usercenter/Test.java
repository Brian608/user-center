package com.feather.usercenter;

/**
 * @projectName: user-center
 * @package: com.feather.usercenter
 * @className: Test
 * @author: feather(杜雪松)
 * @description: TODO
 * @since: 2022/6/26 19:43
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        FruitManagement fruitManagement=new FruitManagement();
        fruitManagement.insertFruit(new Fruit("西瓜",6.0,80.0));
        fruitManagement.insertFruit(new Fruit("葡萄",28.0,30.0));
        fruitManagement.insertFruit(new Fruit("荔枝",40.0,50.0));
        fruitManagement.show();

    }
}
