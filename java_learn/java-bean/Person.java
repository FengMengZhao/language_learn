package org.fmz.test.beanutils;

import java.lang.reflect.*;
import org.apache.commons.beanutils.*;

public class Person {

    private String name;
    private String phone;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }            

    public static void main(String args[]) throws Exception{
        /**
         * Creating the Person object
         */
        Person person = new Person();
         
        /**
         * setting the Values.
         */
        person.setName("Codesuggestions");
        person.setPhone("999-999-9999");
         
        /**
         * getting the Values.
         */
        System.out.println("Person Name is::" + person.getName());
        System.out.println("Person Phone is::" + person.getPhone());

        System.out.println();

        /**
         * getting the Fields using Reflection API.
         */
        Field[] fields = person.getClass().getDeclaredFields();
         
        /**
         * Settign the Values..
         */
        for (Field field : fields) {
            System.out.println("Field Name::" + field.getName());
            if (field.getName().equalsIgnoreCase("name")) {
                BeanUtils.setProperty(person, field.getName(), "codesuggestions");
            } else {
                BeanUtils.setProperty(person, field.getName(), "999-999-9999");
            }
        }
         
        /**
         * gettign the Values..
         */
        for (Field field : fields) {
            String property = BeanUtils.getProperty(person, field.getName());
            System.out.println("Bean Values Using BeanUtils.getProperty()::" + property);
        }

    }

}
