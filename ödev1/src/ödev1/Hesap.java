package ödev1;

public class Hesap {
    private String musteriAdi;
    private int hesapNo;
    private double bakiye;

    //Constructor
    public Hesap(String musteriAdi, int hesapNo, double baslangicBakiyesi) {
        this.musteriAdi = musteriAdi;
        this.hesapNo = hesapNo;
        this.bakiye = baslangicBakiyesi;
    }

    public void bakiyeGoruntule() {
        System.out.println("Hesap No: " + hesapNo);
        System.out.println("Müşteri Adı: " + musteriAdi);
        System.out.println("Bakiye: " + bakiye);
    }

    public void paraYatir(double miktar) {
        bakiye += miktar;
        System.out.println("Hesabınıza " + miktar + " TL yatırıldı.");
    }

    public void paraCek(double miktar) {
        if (bakiye >= miktar) {
            bakiye -= miktar;
            System.out.println("Hesabınızdan " + miktar + " TL çekildi.");
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }
}
