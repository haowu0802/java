/**
 Exercise 7: (1) Turn the Incrementable code fragments into a working program.
 */
public class Exe07 {
    public static void main(String[] args){
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println(st1.i);
        System.out.println(st2.i);

        Incrementable sf = new Incrementable();
        sf.increment();
        System.out.println(st1.i);
        System.out.println(st2.i);

        System.out.println("done");
    }
}

class StaticTest {
    static int i = 47;
}

class Incrementable {
    static void increment() { StaticTest.i++; }
}