public class Main {

    public static void main(String[] args) {

        OOP mat = new OOP(
                "Murro",
                "Matematik 2. ünite sonu",
                68,
                94
        );

        mat.showInfo();

        System.out.println("Ortalama: " + mat.getAverage());
    }
}
