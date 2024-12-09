public class Unggas extends Hewan {
    protected String berkembangBiak;

    public Unggas() {
        this.berkembangBiak = "Bertelur";
    }

    public void cetak() {
        System.out.println("======== Data Hewan Unggas ========");
        System.out.println("Suara: " + suara);
        System.out.println("Berkembang Biak: " + berkembangBiak);
    }
}