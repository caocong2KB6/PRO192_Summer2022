
import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) {

        float num1, num2;
        String op;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number 1: ");
        num1 = sc.nextFloat();
        System.out.print("Input the number 2: ");
        num2 = sc.nextFloat();
        System.out.print("Input the operator(+-*/): ");
        sc.nextLine();
        op = sc.nextLine();
        if (op.equals("+")) {
            System.out.println("The result of " + num1 + " " + op + " " + num2 + " = " + (num1 + num2));
        } else if (op.equals("-")) {
            System.out.println("The result of " + num1 + " " + op + " " + num2 + " = " + (num1 - num2));
        } else if (op.equals("*")) {
            System.out.println("The result of " + num1 + " " + op + " " + num2 + " = " + (num1 * num2));
        } else if (op.equals("/")) {
            if (num2 != 0) {
                System.out.println("The result of " + num1 + " " + op + " " + num2 + " = " + (num1 / num2));
            } else {
                System.out.println("Number 2 is 0. Not support!!");
            }
        }

    }
}
