public class Lingkaran extends BangunDatar {
    float r;

    // Constructor untuk Lingkaran
    public Lingkaran(float r) {
        this.r = r;
    }

    // Override untuk menghitung luas lingkaran
    @Override
    float luas() {
        return (float) (Math.PI * r * r);
    }

    // Override untuk menghitung keliling lingkaran
    @Override
    float keliling() {
        return (float) (2 * Math.PI * r);
    }
}