### 单例模式(Singleton)

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
        private static Singleton instance = new Singleton();
        private Singleton(){}
        public static Singleton getInstance(){
            return instance;
        }
    }

> 优点：实现比较简单，在类加载的过程中就完成了实例化，避免了线程的同步问题。

> 缺点：没有Lazy loading的效果，可能没有用到这个实例就会加载，如果实例很大就会占用大量的内存空间，造成资源的浪费。

> 使用：如果单例模式的一个对象很大，则从内存优化的角度，不建议使用，但是这种方法是线程安全的。

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
        }
    }

> 保证了延迟加载和线程安全，效率高。

### 内部类[推荐使用]

    public class Singleton{
        private static class SingletonHolder{
            private static Singleton instance = new Singleton();
        }

        public static Singleton getInstance(){
            return new instance;
        }
    }

> 在类进行加载的时候，并不会进行内部类的加载，只有当访问getInstance()方法的时候才会加载SingletonHolder类，从而完成对象的实例化，这样也就起到了延迟加载的效果，并且保证了线程的安全性。

> JVM保证了线程的安全性，因为静态属性只会在类第一次加载的时候初始化，在类进行初始化的时候，别的线程是无法进入的。

### 枚举[推荐使用]

    public enum SingletonEnum{
            instance;
            private SingletonEnum(){}
            public void method(){}
    }

> 枚举实现的单例模式，保证了线程安全，而且还能防止反序列化重新创建新的对象
