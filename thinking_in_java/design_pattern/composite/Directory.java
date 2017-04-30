package org.fmz.pattern;

import java.util.*;

public class Directory{
    private String name;
    private List files = new ArrayList();
    public Directory(String name){
        this.name = name;
    }
    public void add(Object obj){
        files.add(obj);
    }
    public void ls(){
        System.out.println(CompositeDemo.g_indent + name);
        CompositeDemo.g_indent.append("   ");
        for(int i = 0; i < files.size(); i++){
            Object obj = files.get(i);
            //System.out.println(obj.getClass().getName());
            if(obj.getClass().getSimpleName().equals("Directory"))
                ((Directory)obj).ls();
            else
                ((File)obj).ls();
        }
        CompositeDemo.g_indent.setLength(CompositeDemo.g_indent.length() - 3);
    }
}
