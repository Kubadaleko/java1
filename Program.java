
/**
 * Program
 */
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= 1000; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
