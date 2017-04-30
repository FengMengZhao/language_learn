package org.fmz.pattern;

public class File{
    private String name;
    public File(String name){
        this.name = name;
    }

    public void ls(){
        System.out.println(CompositeDemo.g_indent + name);
    }
}
