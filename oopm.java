public class Main {

    public static void main(String[] args) {

        OOP[] dersler = new OOP[5];

        dersler[0] = new OOP("Murro Hoca", "Matematik ödevi", "Pazartesi", 80, 90);
        dersler[1] = new OOP("Fatmagül Hoca", "Türkçe kompozisyon", "Salı", 75, 85);
        dersler[2] = new OOP("Derya Hoca", "Fen deney raporu", "Çarşamba", 60, 70);
        dersler[3] = new OOP("Yeliz Hoca", "İngilizce kelime ezberi", "Perşembe", 90, 95);
        dersler[4] = new OOP("Hoca Hoca", "Tarih sunumu", "Cuma", 85, 80);

        for (int i = 0; i < dersler.length; i++) {

            System.out.println("------- " + (i + 1) + ". Gün -------");
            dersler[i].showInfo();
            System.out.println("Ortalama: " + dersler[i].getAverage());
            System.out.println();
        }
    }
}
