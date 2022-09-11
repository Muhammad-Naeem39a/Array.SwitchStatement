import java.util.Scanner;

public class MethodsInJava {
    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter No to find its recursion");
        int a = input.nextInt();
        int result = sum(a);
        System.out.println(result);
        System.out.println("Enter your age to know your access");
        int age = input.nextInt();
        checkAge(age);
    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}
