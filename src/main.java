import java.sql.SQLOutput;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Integer option, firstInput, secondInput;

            menu();
            option = sc.nextInt();

           switch (option) {
               case 1:
                   System.out.println("Enter first number");
                   firstInput = sc.nextInt();
                   System.out.println("Enter second number");
                   secondInput = sc.nextInt();
                   sum(firstInput, secondInput);
                   break;
               case 2:
                   System.out.println("Enter first number");
                   firstInput = sc.nextInt();
                   System.out.println("Enter second number");
                   secondInput = sc.nextInt();
                   subtract(firstInput, secondInput);
                   break;
               case 3:
                   System.out.println("Enter first number");
                   firstInput = sc.nextInt();
                   System.out.println("Enter second number");
                   secondInput = sc.nextInt();
                   multiply(firstInput, secondInput);
                   break;
               case 4:
                   System.out.println("Enter first number");
               firstInput = sc.nextInt();
                   System.out.println("Enter second number");
               secondInput = sc.nextInt();
               divide(firstInput, secondInput);
               break;
           }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }


    }

    public static void menu() {
        System.out.print("Which equation would you like to do\n" +
                "1) Addition\n" +
                "2) Subtraction\n" +
                "3) Multiplication\n" +
                "4) Division\n");

    }

    public static int sum(int a, int b) {
        int result = 0;
        try {
            result= a + b;
        } catch (Exception e) {
            System.out.println("Function sum error");
        }
        return result;
    }

    public static int subtract(int a, int b) {
        int result = 0;
        try {
            result= a - b;
        } catch (Exception e) {
            System.out.println("Something went wrong (subtract)");
        }
        return result;
    }

    public static int multiply(int a, int b) {
        int result = 0;
        try {
            result= a * b;
        } catch (Exception e) {
            System.out.println("Something went wrong (multiply)");
        }
        return result;
    }

    public static int divide(int a, int b) {
        int result = 0;
        try {
            result= a / b;
        } catch (Exception e) {
            System.out.println("Something went wrong (divide)");
        }
        return result;
    }
}
