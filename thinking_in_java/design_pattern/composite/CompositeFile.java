package org.fmz.pattern;

public class CompositeFile implements AbstractFile{
    private String name;
    public CompositeFile(String name){
        this.name = name;
    }

    public void ls(){
        System.out.println(CompositeDemo.g_indent + name);
    }
}
