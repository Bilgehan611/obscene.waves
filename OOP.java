public class OOP {

    String Ogretmen;
    String Odev;
    String Gun;
    int YazılıNotu;
    int SozluNotu;

    public OOP(String Ogretmen, String Odev, String Gun,
               int YazılıNotu, int SozluNotu) {

        this.Ogretmen = Ogretmen;
        this.Odev = Odev;
        this.Gun = Gun;
        this.YazılıNotu = YazılıNotu;
        this.SozluNotu = SozluNotu;
    }

    public void showInfo() {
        System.out.println("Öğretmen: " + Ogretmen);
        System.out.println("Ödev: " + Odev);
        System.out.println("Gün: " + Gun);
        System.out.println("Yazılı Notu: " + YazılıNotu);
        System.out.println("Sözlü Notu: " + SozluNotu);
    }

    public double getAverage() {
        return (SozluNotu + YazılıNotu) / 2.0;
    }
}
