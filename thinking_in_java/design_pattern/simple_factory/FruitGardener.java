/**
 * 简单的工厂模式涉及到"工厂角色"、"抽象产品角色"、"具体产品角色"
 * 工厂类角色：担任这个角色的是工厂方法的核心，含有与应用紧密联系的商业逻辑;
 * 工厂类在客户端的直接调用下创建产品对象，它往往有一个具体的java类实现
 * 抽象产品角色：担任这个角色的类是由工厂方法模式所创建对象的父类，或它们共同拥有的接口;
 * 抽象产品角色可以用一个java接口或者java的抽象类实现
 * 具体产品角色：工厂方法模式所创建的任何对象都是这个角色的实例，具体产品的角色由一个java类实现
 * 
 *
 * 简单工厂模式的优点：
 * 模式的核心是工厂类。这个类含有必要的判断逻辑，可以决定在什么时候创建哪一个产品类的实例
 * 客户端可以免除直接创建产品对象的责任，而仅仅负责消费产品
 * 实现对责任的分割
 *
 *
 * 简单工厂模式的缺点：
 * 工厂类集中了所有产品的创建逻辑，形成了一个无所不知的全能类(God Class)
 * 这个全能类负责整个产品的创建，是关键人物，如果不能工作就会影响到整个产品的创建;
 * 当产品类有不同的接口种类时， 工厂类需要判断在什么时候创建某种产品
 * 将时机的判断和对哪一个具体产品的判断逻辑混合在一起
 * 使得系统在进行功能扩展的时候比较困难(工厂方法模式克服);
 * 简单的工厂模式使用的是静态方法作为工厂方法，而静态的方法无法由子类继承
 * 工厂角色无法形成基于继承的等级结构(工厂方法模式克服);
 * 
 *
 * java.text.DateFormat 和 java.text.SimpleDateFormat
 * java api 中简单工厂模式的典型应用
 * DateFormat是抽象类，提供了静态的工厂方法返回DateFromat对象
 * 具体类SimpleDateFormat的实例化工作实现隐藏在多态中
 *
 * 工厂方法将实例化那些对象以及如何实例化这些对象的细节隐藏起来，使得这些对象的使用得到简化
 */

package org.fmz.pattern;

public class FruitGardener{

    public static Fruit factory(String which) throws BadFruitException{
        switch(which.toLowerCase()){
            case "apple":
                return new Apple();
            case "grape":
                return new Grape();
            case "strawberry":
                return new Strawberry();
            default:
                throw new BadFruitException("Bad fruit request");
        }
    }
}