package Calc;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        double num1;
        double num2;
        double res = 0;
        char oper;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите операцию: (+ ; - ; * ; /) ");
        oper = scanner.next().charAt(0);
        System.out.println("Введите первое число :");
        num1 = scanner.nextDouble();
        System.out.println("Введите второе число :");
        num2 = scanner.nextDouble();
        switch (oper) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            default:
                System.out.println("Вы что-то не то ввели, попробуете еще раз");

        }
        System.out.printf("Результат операции: %.2f %c %.2f = %.2f", num1, oper, num2, res);
        scanner.close();
    }
}
