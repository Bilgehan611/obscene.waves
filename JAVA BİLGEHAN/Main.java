import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("İlk notu girin: ");
        double n1 = input.nextDouble();

        System.out.print("İkinci notu girin: ");
        double n2 = input.nextDouble();

        double cevre = 3 * n1;

        double nf = (n1 + n2) / 2;


        if (nf > 60) {
            System.out.println("Geçtin");
        } else {
            System.out.println("Kaldın".toUpperCase());
        }

        input.close();
    }
}
