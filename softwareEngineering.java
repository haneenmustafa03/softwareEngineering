import java.util.Scanner;
public class softwareEngineering {
    public static void main(String [] Args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to do?");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        int menuOption = scanner.nextInt();

        switch(menuOption) {
            case 1:
                System.out.println("Input first number");
                int num1 = scanner.nextInt();

                System.out.println("Input second number");
                int num2 = scanner.nextInt();

                System.out.println(num1 + num2);
            break;

            case 2:
                System.out.println("Input first number");
                num1 = scanner.nextInt();

                System.out.println("Input second number");
                num2 = scanner.nextInt();

                System.out.println(num1 - num2);
        }

    }
}
