public class Ayam extends Unggas {
    private String jenis;
    private String ciri;

    public Ayam() {
        this.jenis = "Ayam Kampung";
        this.ciri = "Bulu bercorak putih hitam";
        this.suara = "Petok-Petok...";
    }

    @Override
    public void cetak() {
        System.out.println("======== Data Hewan Unggas Ayam ========");
        System.out.println("Jenis: " + jenis);
        System.out.println("Ciri: " + ciri);
        System.out.println("Suara: " + suara);
        System.out.println("Berkembang Biak: " + berkembangBiak);
    }
}