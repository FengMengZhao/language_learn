package org.fmz.july;

public class TestSearch{

    public static void main(String args[]){
        TestUser tu = new TestUser("fmz", 28);
        TestUser tu1 = new TestUser("cll", 27);
        TestUser tu2 = new TestUser("fsl", 8);

        AbstractVector vector = new DynamicVector(10);
        vector.append(tu);
        vector.append(tu1);
        vector.append(tu2);
    }
}
