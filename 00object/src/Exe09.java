/**
 Exercise 9: (2) Write a program that demonstrates that autoboxing works for all the
 primitive types and their wrappers.
 */


public class Exe09 {
    public static void main(String[] args){

        /* Boolean autoboxing */
        Boolean bl = true;
        boolean b = bl;
        Boolean bl1 = b;
        System.out.println(bl.getClass());
        System.out.println((b));
        System.out.println(bl1.getClass());

        /* Character autoboxing */
        Character ch = 'x';
        char c = ch;
        Character ch1 = c;
        System.out.println(ch.getClass());
        System.out.println((c));
        System.out.println(ch1.getClass());

        /* Byte autoboxing */
        Byte byt = 127;
        byte by = byt;
        Byte byt1 = by;
        System.out.println(byt.getClass());
        System.out.println((by));
        System.out.println(byt1.getClass());

        /* Short autoboxing */
        Short sht = (short)((int)Math.pow(2,15)-1);
        short sh = sht;
        Short sht1 = sh;
        System.out.println(sht.getClass());
        System.out.println((sh));
        System.out.println(sht1.getClass());

        /* Integer autoboxing */
        Integer inte = ((int)Math.pow(2,31)-1);
        int in = inte;
        Integer int1 = in;
        System.out.println(inte.getClass());
        System.out.println((in));
        System.out.println(int1.getClass());

        /* Long autoboxing */
        Long lng = ((long)Math.pow(2,63)-1);
        long ln = lng;
        Long lng1 = ln;
        System.out.println(lng.getClass());
        System.out.println((ln));
        System.out.println(lng1.getClass());

        /* Float autoboxing */
        Float flt = ((float)Math.log(15.0));
        float fl = flt;
        Float flt1 = fl;
        System.out.println(flt.getClass());
        System.out.println((fl));
        System.out.println(flt1.getClass());

        /* Double autoboxing */
        Double dbl = (Math.log(15.0));
        double db = dbl;
        Double dbl1 = db;
        System.out.println(dbl.getClass());
        System.out.println((db));
        System.out.println(dbl1.getClass());

        /* Void autoboxing :  Void type cannot be instantiated */
        /*
        Void vd = (Void);
        void v = vd;
        Void vd2 = v;
        System.out.println(vd.getClass());
        System.out.println(v);
        System.out.println(vd2.getClass());

        System.out.println("done");
        */
    }
}
