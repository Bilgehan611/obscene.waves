import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] sayi = new int[50];
        Random rand = new Random();


        for (int r = 0; r < sayi.length; r++) {
            sayi[r] = rand.nextInt(999999999);
        }


        for (int i = 0; i < sayi.length - 1; i++) {

            for (int j = 0; j < sayi.length - 1 - i; j++) {

                if (sayi[j] > sayi[j + 1]) {



                    int temp = sayi[j];
                    sayi[j] = sayi[j + 1];
                    sayi[j + 1] = temp;
                }

            }
        }



        System.out.println("Sıralısı:");
        for (int n : sayi) {
            System.out.print(n + " ");
        }
    }
}
