public class Satpam extends Pegawai {
    @Override
    public void menampilkan() {
        System.out.println("Nama: " + nama);
        System.out.println("Id Pegawai: " + id_pegawai);
        System.out.println("Gaji: " + gaji);
    }

    // Metode untuk tugas satpam
    public void tugas() {
        System.out.println("Tugas: Menjaga keamanan di dalam dan di luar franchise");
        System.out.println("------------------------------");
    }
}