### 单例模式(Singleton)(creational)

* Allow one instance of given class

    * The class hold a reference to its only instance
    * Lazy(on request) or static initialization(on load)
    * Private constructor to restrict external instantiation

* 为什么会使用单例模式

    * 避免因为创建对个实例所造成的资源浪费
    * 多个实例的多次调用容易出现结果的错误，单例模式能够保证整个应用只有一个实例

* 单例模式的设计思想

    * 不允许其他程序new对象
    * 在该类中创建对象
    * 对外提供一个可以让其他程序获取上述对象的方法

* 单例模式的写法(5种)

### 饿汉式[可用]

    public class Singleton{
        private static final Singleton instance = new Singleton();
        private Singleton(){}
        public static Singleton getInstance(){
            return instance;
        }
    }

> 优点：实现比较简单，在类加载的过程中就完成了实例化，避免了线程的同步问题。<br><br>
缺点：没有Lazy loading的效果，可能没有用到这个实例就会加载，如果实例很大就会占用大量的内存空间，造成资源的浪费。<br><br>
使用：如果单例模式的一个对象很大，则从内存优化的角度，不建议使用，但是这种方法是线程安全的。

### 饿汉式[变换写法]

    public class Singleton{
        private static Singleton instance = null;
        static{
            instance = new Singleton();
        }

        public static Singleton getInstance(){
            return instance;
        }
    }

> static静态块进行加载，同样是在类加载的过程中就完成了实例化；是饿汉式的另一种不同的写法，效果同饿汉式相同。

### 懒汉式[线程不安全，不可用]

    public class Singleton{
        private static Singleton instance = null;
        private Singleton(){}

        public static Singleton getInstance(){
            if(instance == null) 
                instance = new Singleton();
            return instance;
        }
    }

> if语句块存在线程安全问题，线程不安全，不推荐使用

### 懒汉式&线程安全[线程安全，效率低不推荐使用]

    public class Singleton{
        private static Singleton instance = null;
        private Singleton(){}

        public static synchronized Singleton getInstance(){
            if(instance == null) 
                instance = new Singleton();
            return instance;
        }
    }

> 缺点：每个线程在想获得类的实例的时候，getInstance()方法都要进行同步，而这种方法只执行一次实例化代码就足够了，后面想要获得该类实例，直接return就好了。方法进行同步的效率太低。

### 懒汉式&双重校验锁[推荐使用]

    public class Singleton{
        private static Singleton instance = null;

        private Singleton(){}
        public static Singleton getInstance(){
            if(instance == null){
                synchronized(Singleton.class){
                    if(instance == null)
                        instance = new Singleton();
                }
            }
            return instance;
        }
    }

> 保证了延迟加载和线程安全，效率高。

### 内部类[推荐使用]

    public class Singleton{
        private static class SingletonHolder{
            private static Singleton instance = new Singleton();
        }

        public static Singleton getInstance(){
            return instance;
        }
    }

> 在类进行加载的时候，并不会进行内部类的加载，只有当访问getInstance()方法的时候才会加载SingletonHolder类，从而完成对象的实例化，这样也就起到了延迟加载的效果，并且保证了线程的安全性。<br><br>
JVM保证了线程的安全性，因为静态属性只会在类第一次加载的时候初始化，在类进行初始化的时候，别的线程是无法进入的。

### 枚举[推荐使用]

    public enum SingletonEnum{
            instance;
            private SingletonEnum(){}
            public void method(){}
    }

> 枚举实现的单例模式，保证了线程安全，而且还能防止反序列化重新创建新的对象

### 单例模式应用

**Java JDK应用单例模式**

`Java JDK`中`java.lang.Runtime`使用了单例模式；一个Java应用仅仅允许有一个运行时的实例和Java运行时环境进行交互，`getRuntime()`方法与`getInstance()`方法相类似。

**单例模式的经典应用场景**

- 硬件资源的访问。例如：打印机的打印池，避免并发访问的问题。
- 日志。避免并发访问的问题。
- 配置文件。为了提高性能。
- 缓存。为了提高性能.

### 单例模式实践

> 需求：一个ATM打印机程序，能够打印不同种类的账单信息(简易版的和明细版的)；要去内存的使用是最小的。

- 设计模式
    - 工厂模式(Factory Pattern)
    - 单例模式(Singleton Pattern)

>创建一个`StatementType`的接口，简易版和明细版分别实现接口<br><br>
工厂模式：客户端和工厂进行交互，完全感觉不到对象的创建。当需要增加新的打印模式(比如信用卡账单打印)，可以新增加一个类`CreditTye`，这样就保证了可扩展性，符合设计模式中开闭原则<br><br>
单例模式：为了保证内存的占用最小，可以考虑工厂对象的创建采用单例模式

示例代码：

**Factory.java**

    package org.fmz.design_pattern

    public abstract class Factory {
        protected abstract StatementType createStatements(String selection);
    }

> 抽象的工厂类。这个类是和客户端进行交互的契约，所有的工厂实现类必须继承这个抽象工厂类

**StatementFactory.java**

    package org.fmz.design_pattern;

    public class StatementFactory extends Factory {
        private static StatementFactory uniqueInstance;
        private StatementFactory() {
        
        }
        public static StatementFactory getUniqueInstance() {
            if (uniqueInstance == null) {
                uniqueInstance = new StatementFactory();
                System.out.println("Creating a new StatementFactory instance");
            
            }
            return uniqueInstance;
        
        }

        @Override
        public StatementType createStatements(String selection) {
            if (selection.equalsIgnoreCase("detailedStmt")) {
                return new DetailedStatement();
            
            } else if (selection.equalsIgnoreCase("miniStmt")) {
                return new MiniStatement();
            
            }
            throw new IllegalArgumentException("Selection doesnot exist");
        
        }

    }

> 工厂的实现类。这是对象创建的主类。

**StatementType.java**

    package org.fmz.design_pattern;

    public interface StatementType {
        String print()
    }

> 打印类型的接口。提供不同类型打印方式的抽象。

**DetailedStatement.java**

    package org.fmz.design_pattern;

    public class DetailedStatement implements StatementType {
        @Override
            public String print() {
            System.out.println("Detailed Statement Created");
            return "detailedStmt";
        
            }

    }

> 明细版打印类型的具体实现。

**MiniStatement.java**

    package org.fmz.design_pattern;

    public class MiniStatement implements StatementType {
        @Override
            public String print() {
            System.out.println("Mini Statement Created");
            return "miniStmt";
        
            }

    }

> 简易版打印类型的具体实现。

**Client.java**

    package org.fmz.design_pattern;

    public class Client {
        public static void main(String[] args) {
            System.out.println("Enter your selection:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String selection = null;
            try {
                selection = br.readLine();
            
            } catch (IOException e) {
                e.printStackTrace();
            
            }
            Factory factory = StatementFactory.getUniqueInstance();
            StatementType objStmtType = factory.createStatements(selection);
            System.out.println(objStmtType.print());
        
        }

    }

> 客户端
