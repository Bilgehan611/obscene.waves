public class OOP {
    String Ogretmen;
    String Odev;
    int YazılıNotu;
    int SozluNotu;

    public OOP(String Ogretmen, String Odev ,
               int YazılıNotu, int SozluNotu) {
        this.Ogretmen = Ogretmen;
                this.Odev = Odev;
                        this.YazılıNotu = YazılıNotu;
                                this.SozluNotu = SozluNotu;
    }
public void showInfo() {
    System.out.println("Öğretmen: " + Ogretmen);
    System.out.println("Ödev: " + Odev);
    System.out.println("Yazılı Notu: " + SozluNotu);
    System.out.println("Sözlü Notu: " + YazılıNotu);
}
    public double getAverage() {
        return (SozluNotu + YazılıNotu)/2;
    }
}
