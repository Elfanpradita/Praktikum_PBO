public class Koki extends Pegawai {
    @Override
    public void menampilkan() {
        System.out.println("Nama: " + nama);
        System.out.println("Id Pegawai: " + id_pegawai);
        System.out.println("Gaji: " + gaji);
    }

    // Metode untuk tugas koki
    public void tugas() {
        System.out.println("Tugas: Memasak makanan dan membuat minuman");
        System.out.println("------------------------------");
    }
}