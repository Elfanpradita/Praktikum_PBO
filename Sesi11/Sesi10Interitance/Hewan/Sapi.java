public class Sapi extends Mamalia {
    private String nama;
    private int umur;

    public Sapi() {
        this.nama = "Sopi";
        this.umur = 1;
        this.suara = "Hemoh..";
    }

    @Override
    public void cetak() {
        System.out.println("======== Data Hewan Mamalia Sapi ========");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Suara: " + suara);
        System.out.println("Berkembang Biak: " + berkembangBiak);
    }
}