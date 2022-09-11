import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0]="Apple";
        System.out.println(cars[0]);
        System.out.println(cars.length);
        String[] newCars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < newCars.length; i++) {
            System.out.println(newCars[i]);
        }
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i <= 10; i = i + 2) {
//            if (i == 4) {
//                continue;
//            }
//            System.out.println(i);
//        }
//        System.out.print("Enter the Day No to know its Name : ");
//        int day = input.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Looking forward to the Weekend");
//        }
    }
}

