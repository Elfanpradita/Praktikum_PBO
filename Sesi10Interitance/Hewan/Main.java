public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Sapi
        Sapi sapi = new Sapi();
        sapi.cetak();

        System.out.println();

        // Membuat objek dari kelas Kambing
        Kambing kambing = new Kambing();
        kambing.cetak();

        System.out.println();

        // Membuat objek dari kelas Ayam
        Ayam ayam = new Ayam();
        ayam.cetak();
        
        System.out.println();
        
        // Jika Anda memiliki kelas lain, Anda bisa membuat objek dan memanggil metode cetak() seperti di bawah:
        // Burung burung = new Burung();
        // burung.cetak();
    }
}