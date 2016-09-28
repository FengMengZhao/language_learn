package org.fmz.pattern;

public class AmericanRestaurant implements Restaurant{
    public Appetizer getAppetizer() {
        return new Oysters();// 牡蛎
    }

    public Entree getEntree(){
        return new Steak();// 牛排
    }

    public Dessert getDessert(){
        return new CheeseCake();// 奶酪
    }
}
