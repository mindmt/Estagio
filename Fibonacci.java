import java.util.Locale;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (isFibonacci(num)) {
            System.out.printf("%d pertence a sequência de Fibonacci%n", num);
        }
        else {
            System.out.printf("%d não pertence a sequência de Fibonacci%n", num);
        }
        sc.close();
    }

    private static boolean isFibonacci(int num) {
        if (num == 0){
            return true;
        }
        int a = 0, b = 1;

        while (b <= num){
            if (b == num){
                return true;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        return false;
    }
}