import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PHDProgram phdProgram = new PHDProgram("CSE");
        
        while (true) {
            System.out.println("\n--- PHD Program Yönetim Sistemi ---");
            System.out.println("1. Öğrenci Ekle");
            System.out.println("2. Kursa Kayıt Yap");
            System.out.println("3. Teze Kayıt Yap");
            System.out.println("4. Program Detaylarını Görüntüle");
            System.out.println("5. Çıkış");
            System.out.print("Seçiminiz (1-5): ");
            
            int secim = scanner.nextInt();
            scanner.nextLine(); // Buffer temizleme
            
            switch (secim) {
                case 1:
                    System.out.println("Öğrenci Tipi (1: Tam Zamanlı, 2: Yarı Zamanlı): ");
                    int ogrenciTipi = scanner.nextInt();
                    scanner.nextLine(); // Buffer temizleme
                    
                    System.out.print("Öğrenci Numarası: ");
                    String ogrenciNo = scanner.nextLine();
                    
                    System.out.print("Öğrenci Adı: ");
                    String ogrenciAdi = scanner.nextLine();
                    
                    if (ogrenciTipi == 1) {
                        phdProgram.addStudent(new FullTimeStudent(ogrenciNo, ogrenciAdi));
                    } else if (ogrenciTipi == 2) {
                        phdProgram.addStudent(new PartTimeStudent(ogrenciNo, ogrenciAdi));
                    }
                    System.out.println("Öğrenci başarıyla eklendi.");
                    break;
                    
                case 2:
                    System.out.print("Kurs Kodu: ");
                    String kursKodu = scanner.nextLine();
                    
                    System.out.print("Kurs Adı: ");
                    String kursAdi = scanner.nextLine();
                    
                    System.out.print("Bölüm: ");
                    String kursBolum = scanner.nextLine();
                    
                    System.out.print("Öğrenci Numarası: ");
                    String ogrNo = scanner.nextLine();
                    
                    Student student = phdProgram.findStudent(ogrNo);
                    if (student != null) {
                        PHDCourse course = new PHDCourse(kursKodu, kursAdi, kursBolum);
                        phdProgram.registerCourse(student, course);
                        System.out.println("Kurs kaydı başarıyla yapıldı.");
                    } else {
                        System.out.println("Öğrenci bulunamadı!");
                    }
                    break;
                    
                case 3:
                    System.out.print("Tez Kodu: ");
                    String tezKodu = scanner.nextLine();
                    
                    System.out.print("Tez Başlığı: ");
                    String tezBaslik = scanner.nextLine();
                    
                    System.out.print("Tez Bölümü: ");
                    String tezBolum = scanner.nextLine();
                    
                    System.out.print("Öğrenci Numarası: ");
                    String tezOgrNo = scanner.nextLine();
                    
                    Student thesisStudent = phdProgram.findStudent(tezOgrNo);
                    if (thesisStudent != null && thesisStudent instanceof FullTimeStudent) {
                        PHDThesis thesis = new PHDThesis(tezKodu, tezBaslik, tezBolum);
                        phdProgram.registerThesis((FullTimeStudent)thesisStudent, thesis);
                        System.out.println("Tez kaydı başarıyla yapıldı.");
                    } else {
                        System.out.println("Öğrenci bulunamadı veya tam zamanlı öğrenci değil!");
                    }
                    break;
                    
                case 4:
                    System.out.println("\nProgram Detayları:");
                    System.out.println("PHD Program Bölüm Kodu: " + phdProgram.getDeptCode());
                    System.out.println("\nKayıtlı Öğrenciler:");
                    phdProgram.displayStudents();
                    break;
                    
                case 5:
                    System.out.println("Program sonlandırılıyor...");
                    scanner.close();
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Geçersiz seçim! Lütfen 1-5 arası bir sayı giriniz.");
            }
        }
    }
} 