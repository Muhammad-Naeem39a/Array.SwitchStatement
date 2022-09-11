import java.util.Scanner;

public class Taking_Input {
    public static void main(String[] args) {
        System.out.println("Taking Input from User");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Value of a = ");
        float a = input.nextFloat();
        System.out.print("Enter Value of b = ");
        float b = input.nextFloat();
        float  sum = a+b;
        float  multiplication = a*b;
        float  average = sum/2;
        System.out.print("The Sum is = ");
        System.out.println(sum);
        System.out.print("The Multiplication is =  ");
        System.out.println(multiplication);
        System.out.print("The Average is = ");
        System.out.println(average);

    }
}
