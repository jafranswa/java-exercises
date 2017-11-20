package exercises;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        String name;
        Scanner in;

        in =  new Scanner (System.in);
        System.out.println("what is your name?");
        name = in.next();



        System.out.println("hello?" + name);

    }
}
