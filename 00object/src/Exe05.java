/**
 Exercise 5: (1) Modify the previous exercise so that the values of the data in DataOnly
 are assigned to and printed in main( ).
 */
public class Exe05{
    public static void main(String[] args){
        DataOnly5 data = new DataOnly5();
        data.i = 47;
        data.d = 1.1;
        data.b = false;
        System.out.println(data.i);
        System.out.println(data.d);
        System.out.println(data.b);
        System.out.println("done");
    }
}

class DataOnly5 {
    int i;
    double d;
    boolean b;
}