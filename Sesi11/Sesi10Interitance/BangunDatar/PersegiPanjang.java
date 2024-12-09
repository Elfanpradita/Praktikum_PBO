public class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;

    // Constructor untuk Persegi Panjang
    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Override untuk menghitung luas persegi panjang
    @Override
    float luas() {
        return panjang * lebar;
    }

    // Override untuk menghitung keliling persegi panjang
    @Override
    float keliling() {
        return 2 * (panjang + lebar);
    }
}