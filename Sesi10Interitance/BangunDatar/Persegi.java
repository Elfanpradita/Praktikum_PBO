public class Persegi extends BangunDatar {
    float sisi;

    // Constructor untuk Persegi
    public Persegi(float sisi) {
        this.sisi = sisi;
    }

    // Override untuk menghitung luas persegi
    @Override
    float luas() {
        return sisi * sisi;
    }

    // Override untuk menghitung keliling persegi
    @Override
    float keliling() {
        return 4 * sisi;
    }
}