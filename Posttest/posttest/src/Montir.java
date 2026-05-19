class Montir {
    private String idMontir;
    private String nama;

    public Montir(String idMontir, String nama) {
        this.idMontir = idMontir;
        this.nama = nama;
    }

    // Asosiasi: Montir menggunakan objek Mobil sebagai parameter kerjaan
    public void lakukanQualityControl(Mobil mobil) {
        System.out.println("\n[Proses QC] Montir " + nama + " (ID: " + idMontir + ") sedang memeriksa mobil...");
        System.out.println("Hasil QC: Inspeksi selesai.");
    }
}
