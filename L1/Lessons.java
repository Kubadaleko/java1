
package L1;

import java.util.Scanner;

/**
 * Lessons
 */
public class Lessons {

    public static void main(String[] args) {
        System.out.printf("Введите число n: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int sum = 0;
        int multi = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            multi *= i;
        }
        System.out.printf("Сумма элементов от 1 до %d : %d \n", n, sum);
        System.out.printf("Произведение элементов от 1 до %d : %d \n", n, multi);
        num.close();
    }
}
