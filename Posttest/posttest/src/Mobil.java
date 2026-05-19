class Mobil {
    private String merk;
    private String warna;
    private int kapasitasMesin;
    private String tipeMesin;
    private Ban[] banMobil;

    // CONSTRUCTOR 1: Menerima 3 Parameter (Solusi untuk error Anda)
    public Mobil(String merk, String warna, int kapasitasMesin) {
        this.merk = merk;
        this.warna = warna;
        this.kapasitasMesin = kapasitasMesin;
        this.tipeMesin = "Belum Diketahui"; // Nilai default jika tidak diisi
    }

    // CONSTRUCTOR 2: Menerima 4 Parameter
    public Mobil(String merk, String warna, int kapasitasMesin, String tipeMesin) {
        this.merk = merk;
        this.warna = warna;
        this.kapasitasMesin = kapasitasMesin;
        this.tipeMesin = tipeMesin;
    }

    public void pasangSetBan(Ban[] ban) {
        this.banMobil = ban;
    }

    public void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk            : " + merk);
        System.out.println("Warna           : " + warna);
        System.out.println("Kapasitas Mesin : " + kapasitasMesin + " cc");
        System.out.println("Tipe Mesin      : " + tipeMesin);
        if (banMobil != null) {
            System.out.println("Jumlah Ban      : " + banMobil.length);
        } else {
            System.out.println("Jumlah Ban      : Belum terpasang");
        }
        System.out.println("=========================");
    }
}
