package org.fmz.container;

public class Individual implements Comparable<Individual>{
    private static long counter = 0;
    private final long id = counter++;
    private String name;
    public Individual(String name){
        this.name = name;
    }
    public Individual(){};
    public String toString(){
        return getClass().getSimpleName() +
            (name == null ? "" : " " + name);
    }

    public long id(){
        return id;
    }

    public boolean equals(Object o){
        return o instanceof Individual &&
            id == ((Individual)o).id();
    }

    public int hashCode(){
        int result = 17;
        if(name != null)
            return 37 * result + name.hashCode();
        result = 37 * result + (int)id;
        return result;
    }

    public int compareTo(Individual arg){
        String first = getClass().getSimpleName();
        String arg_first = arg.getClass().getSimpleName();
        int first_compare = first.compareTo(arg_first);
        if(first_compare != 0)
            return first_compare;
        if(name != null && arg.name != null){
            int second_compare = name.compareTo(arg.name);
            if(second_compare != 0)
                return second_compare;
        }
        return (arg.id < id ? -1 : (arg.id == id ? 0 : 1));
    }
}
