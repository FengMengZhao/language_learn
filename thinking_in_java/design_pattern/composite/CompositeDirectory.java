package org.fmz.pattern;

import java.util.*;

public class CompositeDirectory implements AbstractFile{
    private String name;
    private List<AbstractFile> files = new ArrayList<>();

    public CompositeDirectory(String name){
        this.name = name;
    }

    public void add(AbstractFile obj){
        files.add(obj);
    }

    public void ls(){
        System.out.println(CompositeDemo.g_indent + name);
        CompositeDemo.g_indent.append("   ");
        for(int i = 0; i < files.size(); i++){
            AbstractFile af = files.get(i);
            af.ls();
        }
        CompositeDemo.g_indent.setLength(CompositeDemo.g_indent.length() - 3);
    }
}
