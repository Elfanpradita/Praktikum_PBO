public class Kambing extends Mamalia {
    private String nama;
    private int umur;

    public Kambing() {
        this.nama = "Si Ling";
        this.umur = 2;
        this.suara = "Embek...";
    }

    @Override
    public void cetak() {
        System.out.println("======== Data Hewan Mamalia Kambing ========");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Suara: " + suara);
        System.out.println("Berkembang Biak: " + berkembangBiak);
    }
}