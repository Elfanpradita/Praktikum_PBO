public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;

    // Constructor untuk Segitiga
    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Override untuk menghitung luas segitiga
    @Override
    float luas() {
        return (alas * tinggi) / 2;
    }

    // Override untuk menghitung keliling segitiga (asumsi segitiga sama sisi)
    @Override
    float keliling() {
        return 3 * alas; // asumsi semua sisi segitiga sama panjang
    }
}