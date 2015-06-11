/*
Exercise 4: (1) Turn the DataOnly code fragments into a program that compiles and
runs.
 */

public class Exe04{
    public static void main(String[] args){
        DataOnly data = new DataOnly();
        data.i = 47;
        data.d = 1.1;
        data.b = false;
        System.out.println("done");
    }
}

class DataOnly {
    int i;
    double d;
    boolean b;
}