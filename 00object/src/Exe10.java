/**
 Exercise 10: (2) Write a program that prints three arguments taken from the command
 line. To do this, you¡¯ll need to index into the command-line array of Strings.
 */
public class Exe10 {
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println((args[i]));
        }

    }
}
