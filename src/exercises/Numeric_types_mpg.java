package exercises;
import java.util.Scanner;

public class Numeric_types_mpg {

    public static void main(String[] args){

        double miles;
        double fuel;
        double mpg;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("how many miles have you driven my dear?");
        miles = in.nextDouble();
        System.out.println("how gallons of fuel have you consumed my dear?");
        fuel = in.nextDouble();
        mpg = miles/fuel;
        System.out.println("your current fuel economy is " + mpg + " mpg");


    }


}
