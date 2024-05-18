package Enamul_LabFile;
import java.lang.*;
import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args){
        double num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first numbers:");
        num1 = sc.nextDouble();

        System.out.println("Enter the operator(+,,*,/,%):");
        char op = sc.next().charAt(0);

        System.out.println("Enter the second numbers:");
        num2 = sc.nextDouble();
        double du = 0;

        switch (op) {
            case '+':
                du = num1 + num2;
                break;
            case '-':
                du = num1 - num2;
                break;
            case '*':
                du = num1 * num2;
                break;
            case '/':
                du = num1 / num2;
                break;
            case '%':
                du = (num1 * num2)/100d;

            default:
                System.out.println("You enter wrong input");
        }
        System.out.println("The final result:");
        System.out.println(num1 + " " + op + " " + num2 + " = " + du);
    }
}
