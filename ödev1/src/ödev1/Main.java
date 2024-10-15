package ödev1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Müşteri Adı: ");
        String musteriAdi = scanner.nextLine();
        System.out.print("Hesap No: ");
        int hesapNo = scanner.nextInt();
        System.out.print("Başlangıç Bakiyesi: ");
        double baslangicBakiyesi = scanner.nextDouble();
        
        
        

        Hesap hesap = new Hesap(musteriAdi, hesapNo, baslangicBakiyesi);

        boolean devam = true;
        while (devam) {
            System.out.println("\nİşlem Seçiniz:");
            System.out.println("1. Bakiye Görüntüle");
            System.out.println("2. Para Yatır");
            System.out.println("3. Para Çek");
            System.out.println("4. Çıkış");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    hesap.bakiyeGoruntule();
                    break;
                case 2:
                    System.out.print("Yatırılacak Miktar: ");
                    double yatirilacakMiktar = scanner.nextDouble();
                    hesap.paraYatir(yatirilacakMiktar);
                    break;
                case 3:
                    System.out.print("Çekilecek Miktar: ");
                    double cekilecekMiktar = scanner.nextDouble();
                    hesap.paraCek(cekilecekMiktar);
                    break;
                case 4:
                	System.out.println("Sistemden Çıkışınız Yapılıyor " + musteriAdi + " bey iyi günler dileriz");
                    devam = false;
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }
}