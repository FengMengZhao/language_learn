import java.util.*;

public class TestStringEquals{


    public static void main(String arg[]){
        /*
        String a = "fmz";
        String b = "fmz";
        System.out.println("a address:" + Integer.toHexString(System.identityHashCode(a)));
        System.out.println("b address:" + Integer.toHexString(System.identityHashCode(b)));
        System.out.println(a==b);
        System.out.println(a.equals(b));
        */
        String c = new String("fmz");
        String d = new String("fmz");
        String e = "fmz";
        System.out.println("c address:" + Integer.toHexString(System.identityHashCode(c)));
        System.out.println("d address:" + Integer.toHexString(System.identityHashCode(d)));
        System.out.println("e address:" + Integer.toHexString(System.identityHashCode(e.intern())));
        System.out.println("c.intern() address:" + Integer.toHexString(System.identityHashCode(c.intern())));
        System.out.println("d.intern() address:" + Integer.toHexString(System.identityHashCode(d.intern())));
        System.out.println(c==d);
        System.out.println(c.equals(d));

        System.out.println("intern compare: " + (c.intern() == d.intern()));
        System.out.println("intern compare to string: " + (c.intern() == "fmz"));

    }
}
