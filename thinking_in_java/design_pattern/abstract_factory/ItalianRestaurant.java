package org.fmz.pattern;

public class ItalianRestaurant implements Restaurant{

    @Override
    public Appetizer getAppetizer(){
        return new Pizza();// 比萨饼
    }

    @Override
    public Entree getEntree(){
        return new Pasta();// 意大利面
    }

    @Override
    public Dessert getDessert(){
        return new Gelato();// 冰淇淋
    }
}
