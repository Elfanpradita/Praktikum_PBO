public class Mamalia extends Hewan {
    protected String berkembangBiak;

    public Mamalia() {
        this.berkembangBiak = "Beranak";
    }

    public void cetak() {
        System.out.println("======== Data Hewan Mamalia ========");
        System.out.println("Suara: " + suara);
        System.out.println("Berkembang Biak: " + berkembangBiak);
    }
}