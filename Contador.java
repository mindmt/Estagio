import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = sc.nextLine();

        int count = countOccurrencesOfA(input);

        if (count > 0) {
            System.out.printf("A letra 'a' aparece %d vez(es) na string.%n", count);
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }

        sc.close();
    }

    private static int countOccurrencesOfA(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }
}
