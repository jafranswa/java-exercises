package exercises;
import java.util.Scanner;

public class Numeric_types {

    public static void main(String[] args) {
        Integer length;
        Integer width;
        Integer area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("enter lenth of rectangle");
        length = in.nextInt();
        System.out.println("enter width of rectangle");
        width = in.nextInt();
        area = length * width;
        System.out.println("the area of the rectangle is " + area);

    }

}