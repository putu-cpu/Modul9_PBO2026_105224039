public class Main{
    public static void main(String[] args) throws Exception {
        // Membuat objek Ban
        Ban b1 = new Ban("Bridgestone", 17);
        Ban b2 = new Ban("Bridgestone", 17);
        Ban b3 = new Ban("Bridgestone", 17);
        Ban b4 = new Ban("Bridgestone", 17);

        Ban[] semuaBan = {b1, b2, b3, b4};

        // Membuat objek Mobil
        Mobil mobil1 = new Mobil("Toyota", "Hitam", 1500);

        // Memasang ban ke mobil
        mobil1.pasangSetBan(semuaBan);

        // Tampilkan spesifikasi
        mobil1.tampilkanSpesifikasi();

        // Montir inspeksi
        Montir m1 = new Montir("M001", "Budi");
        m1.lakukanQualityControl(mobil1);

        // Mobil gagal produksi lalu dihancurkan
        mobil1 = null;
        System.out.println("\nMobil dihancurkan (set null)");

        // Bukti Agregasi: Ban tetap ada di memori meskipun objek mobil sudah di-null
        System.out.println("Ban masih tersisa di gudang:");
        b1.tampilkanBan();
    }
}

  
