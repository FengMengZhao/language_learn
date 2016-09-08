package org.fmz.autumn;

public class VectorTest{
    public static void main(String args[]){
        FixedVector<String> fv = new FixedVector<>(10);
        fv.append("fmz");
        fv.append("cll");
        fv.append("wlm");
        fv.append("zjb");
        fv.append("fsl");
        fv.append("fls");
        fv.append("wlm");
        fv.append("zjb");
        fv.append("fsl");
        fv.append("fls");
        fv.append("...");
        for(String str : fv)
            System.out.print(str + ", ");

        System.out.println("#######################");

        DynamicVector<String> dv = new DynamicVector<>(10);
        dv.append("fmz");
        dv.append("cll");
        dv.append("wlm");
        dv.append("zjb");
        dv.append("fsl");
        dv.append("fls");
        dv.append("wlm");
        dv.append("zjb");
        dv.append("fsl");
        dv.append("fls");
        dv.append("...");
        for(String str : dv)
            System.out.print(str + ", ");
    }
}
