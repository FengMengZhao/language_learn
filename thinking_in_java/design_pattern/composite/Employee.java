package org.fmz.pattern;

import java.util.*;

public class Employee{
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinate;

    public Employee(String nm, String dp, int sal){
        name = nm;
        dept = dp;
        salary = sal;
        subordinate = new ArrayList<Employee>();
    }

    public void add(Employee e){
        subordinate.add(e);
    }

    public void remove(Employee e){
        subordinate.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinate;
    }

    public String toString(){
        return "Employee :[Name : "+ name + ", dept : " + dept + ", salary : + " + salary  + "]";
    }
}
