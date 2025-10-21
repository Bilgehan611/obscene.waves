public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Eşkenar üçgenin bir kenar uzunluğunu girin: ");
        double kenar = input.nextDouble();

        System.out.print("Eşkenar üçgenin yüksekliğini girin: ");
        double height = input.nextDouble();

        double cevre = 3 * kenar;
        double alan = (kenar * height) / 2;

        System.out.println("Eşkenar üçgenin çevresi = " + cevre);
        System.out.println("Eşkenar üçgenin alanı = " + alan);

        int a = 1;

        if (a == 1) {
            System.out.println("Ödev bitti hocam");
        } else {
            System.out.println("Bende çalışıyordu hocam".toUpperCase());
        }

        input.close();
    }
}
