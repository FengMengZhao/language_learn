package org.fmz.rtti;

import java.lang.reflect.*;
import java.util.regex.*;

public class ShowMethods{
    private static String usage =
        "Usage:\n" +
        "ShowMethods qualified.class.name\n" +
        "To show all methods in class or:" +
        "ShowMethods qualified.class.name word" +
        "To search for methods involving 'word'";

    private static Pattern p = Pattern.compile("\\w+[.]");// same as "\\w+\\."

    public static void main(String args[]){
        if(args.length == 0){
            System.out.println(usage);
            System.exit(0);
        }

        int lines = 0;
        try{
            Class<?> ref = Class.forName(args[0]);
            Method[] methods = ref.getMethods();
            Constructor[] ctors = ref.getConstructors();
            if(args.length == 1){
                for(Method m : methods)
                    System.out.println(
                            p.matcher(m.toString()).replaceAll(""));
                for(Constructor c : ctors)
                    System.out.println(
                            p.matcher(c.toString()).replaceAll(""));
                lines = methods.length + ctors.length;
            }else{
                for(Method m : methods)
                    if(m.toString().indexOf(args[1]) != -1){
                        System.out.println(
                                p.matcher(m.toString()).replaceAll(""));
                        lines++;
                    }
                for(Constructor c : ctors)
                    if(c.toString().indexOf(args[1]) != -1){
                        System.out.println(
                                p.matcher(c.toString()).replaceAll(""));
                        lines++;            
                }
            }
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
