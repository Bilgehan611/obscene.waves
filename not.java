import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("İlk notu girin: ");
        double n1 = input.nextDouble();

        System.out.print("İkinci notu girin: ");
        double n2 = input.nextDouble();

        double nf = (n1 * 0.4) + (n2 * 0.6);

        if (nf > 75) {
            System.out.println("Geçtin".toLowerCase());
        } else {
            System.out.println("Kaldın".toUpperCase());
        }

        input.close();
    }
}
