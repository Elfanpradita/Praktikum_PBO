public class Main {
    public static void main(String[] args) {
        // Membuat objek dari masing-masing kelas
        Pegawai pegawai = new Pegawai();
        Manager manager = new Manager();
        Kasir kasir = new Kasir();
        Koki koki = new Koki();
        Pelayan pelayan = new Pelayan();
        Satpam satpam = new Satpam();

        // Mengisi data pegawai
        manager.nama = "Sifa";
        manager.id_pegawai = 1;
        manager.gaji = "7 Juta";

        kasir.nama = "Aldi";
        kasir.id_pegawai = 2;
        kasir.gaji = "1,2 Juta";

        koki.nama = "Reza";
        koki.id_pegawai = 3;
        koki.gaji = "2 Juta";

        pelayan.nama = "Dean";
        pelayan.id_pegawai = 4;
        pelayan.gaji = "1,2 Juta";

        satpam.nama = "Aldi";
        satpam.id_pegawai = 5;
        satpam.gaji = "1 Juta";

        // Memanggil metode menampilkan dan tugas
        pegawai.menampilkan();
        manager.menampilkan();
        manager.tugas();

        kasir.menampilkan();
        kasir.tugas();

        koki.menampilkan();
        koki.tugas();

        pelayan.menampilkan();
        pelayan.tugas();

        satpam.menampilkan();
        satpam.tugas();
    }
}