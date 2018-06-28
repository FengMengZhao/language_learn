package org.fmz.july;

public class TestUser implements Comparable{

    private String name;

    private int age;

    public TestUser(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String nm){
        name = nm;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int ag){
        age = ag;
    }

    @Override
    public int compareTo(Object o){
        return name.compareTo(((TestUser)o).getName());
    }
}
