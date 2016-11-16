package org.fmz.pattern;

public class CompositeDemo{
    public static StringBuffer g_indent = new StringBuffer();

    public static void main(String args[]){
        /*
        Directory one = new Directory("dir111"),
                  two = new Directory("dir222"),
                  three = new Directory("dir333");
        File a = new File("a"),
             b = new File("b"),
             c = new File("c"),
             d = new File("d"),
             e = new File("e");

        */
        CompositeDirectory one = new CompositeDirectory("dir111"),
                           two = new CompositeDirectory("dir222"),
                           three = new CompositeDirectory("dir333");
        AbstractFile a = new CompositeFile("a"),
                     b = new CompositeFile("b"),
                     c = new CompositeFile("c"),
                     d = new CompositeFile("d"),
                     e = new CompositeFile("e");
        one.add(a);
        one.add(two);
        one.add(b);
        two.add(c);
        two.add(d);
        two.add(three);
        three.add(e);
        one.ls();
    }
}
