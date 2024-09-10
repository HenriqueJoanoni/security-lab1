import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int option;
            long firstInput, secondInput;

            menu();
            option = sc.nextInt();

            if (option < 1 || option > 4) {
                System.out.println(">>> Option is out of bounds!");
            }

            switch (option) {
                case 1:
                    System.out.println("Enter first number");
                    firstInput = sc.nextInt();
                    System.out.println("Enter second number");
                    secondInput = sc.nextInt();
                    System.out.println("The result is: " + sum(firstInput, secondInput));
                    break;
                case 2:
                    System.out.println("Enter first number");
                    firstInput = sc.nextInt();
                    System.out.println("Enter second number");
                    secondInput = sc.nextInt();
                    System.out.println("The result is: " + subtract(firstInput, secondInput));
                    break;
                case 3:
                    System.out.println("Enter first number");
                    firstInput = sc.nextInt();
                    System.out.println("Enter second number");
                    secondInput = sc.nextInt();
                    System.out.println("The result is: " + multiply(firstInput, secondInput));
                    break;
                case 4:
                    System.out.println("Enter first number");
                    firstInput = sc.nextInt();
                    System.out.println("Enter second number");
                    secondInput = sc.nextInt();
                    System.out.println("The result is: " + divide(firstInput, secondInput));
                    break;
            }
        } catch (Exception e) {
            System.out.println(">>> Something went wrong");
        }
    }

    public static void menu() {
        System.out.print("Which equation would you like to do\n" +
                "1) Addition\n" +
                "2) Subtraction\n" +
                "3) Multiplication\n" +
                "4) Division\n");

    }

    public static int sum(long a, long b) {
        long result = 0;
        try {
            result = a + b;
        } catch (Exception e) {
            System.out.println(">>> Something went wrong (sum)");
        }
        return (int) result;
    }

    public static int subtract(long a, long b) {
        long result = 0;
        try {
            result = a - b;
        } catch (Exception e) {
            System.out.println(">>> Something went wrong (subtract)");
        }
        return (int) result;
    }

    public static int multiply(long a, long b) {
        long result = 0;
        try {
            result = a * b;
        } catch (Exception e) {
            System.out.println(">>> Something went wrong (multiply)");
        }
        return (int) result;
    }

    public static int divide(long a, long b) {
        long result = 0;
        try {
            result = a / b;
        } catch (Exception e) {
            System.out.println(">>> Something went wrong (divide)");
        }
        return (int) result;
    }
}
