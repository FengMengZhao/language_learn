package org.fmz.july;

public class Search{

    private Search(){}

    public static int binarySearch(AbstractVector vector, Comparable target){
        int first = 0;
        int last = vector.size() - 1;
        int middle;
        while(last - first >= 0){
            middle = (last - first) >> 1;
            if(target.compareTo(vector.elementAt(middle)) < 0){
                last = middle - 1;
            }else if(target.compareTo(vector.elementAt(middle)) > 0){
                first = middle + 1;
            }else{
                return middle;
            }
        }
        return -1;
    }
}
