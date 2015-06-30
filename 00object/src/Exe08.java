/**
 Exercise 8: (3) Write a program that demonstrates that, no matter how many objects
 you create of a particular class, there is only one instance of a particular static field in that
 class.
 */
public class Exe08 {

    public static void main(String[] args){
        YesOrNoStatic testObj01 = new YesOrNoStatic();
        YesOrNoStatic testObj02 = new YesOrNoStatic();
        testObj01.str = testObj01.str + " testObj01";
        testObj01.staticString = testObj01.staticString + " testObj01Static";
        System.out.println(testObj01.str);
        System.out.println(testObj01.staticString);

        testObj02.str = testObj02.str + " testObj02";
        testObj02.staticString = testObj02.staticString + " testObj02Static";

        System.out.println(testObj01.str);
        System.out.println(testObj01.staticString);
        System.out.println(testObj02.str);
        System.out.println(testObj02.staticString);
        System.out.println("done");

    }


}

class YesOrNoStatic{
    static String staticString= "initStaticString";
    String str = "initNonStaticString";
}
