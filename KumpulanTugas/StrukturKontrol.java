import java.util.Scanner;

public class StrukturKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    contohIf(scanner);
                    break;
                case 2:
                    contohFor();
                    break;
                case 3:
                    contohWhile();
                    break;
                case 4:
                    contohDoWhile();
                    break;
                case 5:
                    System.out.println("Kembali ke menu utama.");
                    break;
                case 6:
                    System.out.println("Keluar dari program. Terima kasih!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    public static void menu() {
        System.out.println("=== Menu ===");
        System.out.println("1. Contoh If");
        System.out.println("2. Contoh For");
        System.out.println("3. Contoh While");
        System.out.println("4. Contoh Do While");
        System.out.println("5. Kembali ke Menu Utama");
        System.out.println("6. Keluar");
        System.out.print("Pilih menu (1/2/3/4/5/6): ");
    }

    public static void contohIf(Scanner scanner) {
        System.out.println("\n=== Contoh If ===");
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();
        if (angka > 0) {
            System.out.println("Angka positif.");
        } else if (angka < 0) {
            System.out.println("Angka negatif.");
        } else {
            System.out.println("Angka nol.");
        }
    }

    public static void contohFor() {
        System.out.println("\n=== Contoh For ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Nomor: " + i);
        }
    }

    public static void contohWhile() {
        System.out.println("\n=== Contoh While ===");
        int count = 0;
        while (count < 5) {
            System.out.println("Hitungan: " + count);
            count++;
        }
    }

    public static void contohDoWhile() {
        System.out.println("\n=== Contoh Do While ===");
        int count = 0;
        do {
            System.out.println("Hitungan Do While: " + count);
            count++;
        } while (count < 5);
    }
}