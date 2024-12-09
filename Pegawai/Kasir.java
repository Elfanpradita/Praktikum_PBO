public class Kasir extends Pegawai {
    @Override
    public void menampilkan() {
        System.out.println("Nama: " + nama);
        System.out.println("Id Pegawai: " + id_pegawai);
        System.out.println("Gaji: " + gaji);
    }

    // Metode untuk tugas kasir
    public void tugas() {
        System.out.println("Tugas: Melakukan transaksi dengan pembeli");
        System.out.println("------------------------------");
    }
}