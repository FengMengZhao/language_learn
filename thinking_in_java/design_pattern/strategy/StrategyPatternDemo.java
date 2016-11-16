package org.fmz.pattern;

public class StrategyPatternDemo{
    public static void main(String args[]){
        Context c1 = new Context(new OperationAdd()),
                c2 = new Context(new OperationSubstract()),
                c3 = new Context(new OperationMultiply());

        System.out.println(c1.executeStrategy(2, 4));
        System.out.println(c2.executeStrategy(2, 4));
        System.out.println(c3.executeStrategy(2, 4));
    }
}
