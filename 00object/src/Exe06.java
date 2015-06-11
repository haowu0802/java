/**
 Exercise 6: (2) Write a program that includes and calls the storage( ) method defined
 as a code fragment in this chapter.
 */
public class Exe06 {

    int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args){
        Exe06 e6 = new Exe06();
        String str = "abc";
        System.out.println(e6.storage(str));
        System.out.println("done");
    }

}
