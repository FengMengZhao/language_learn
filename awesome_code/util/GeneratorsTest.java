<<<<<<< HEAD
package org.fmz.util;

public class GeneratorsTest{
    public static int size = 153;

    public static void test(Class<?> surround_class){
        for(Class<?> type : surround_class.getClasses()){
            System.out.print(type.getSimpleName() + ": ");
            try{
                Generator<?> g = (Generator<?>)type.newInstance();
                for(int i = 0; i < size; i++)
                    System.out.print(g.next() + " ");
                System.out.println();
            }catch(Exception e){
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String args[]){
        test(CountingGenerator.class);
    }
}
=======
package org.fmz.util;

public class GeneratorsTest{
    public static int size = 153;

    public static void test(Class<?> surround_class){
        for(Class<?> type : surround_class.getClasses()){
            System.out.print(type.getSimpleName() + ": ");
            try{
                Generator<?> g = (Generator<?>)type.newInstance();
                for(int i = 0; i < size; i++)
                    System.out.print(g.next() + " ");
                System.out.println();
            }catch(Exception e){
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String args[]){
        test(CountingGenerator.class);
    }
}
>>>>>>> f85629a531af9d5e4f973b09f304ebd569790ddc
