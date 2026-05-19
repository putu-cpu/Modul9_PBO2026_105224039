public class RumahSakitt {
    String nama; 
    Ruangan[] daftarRuangan = new Ruangan [2]; 
    Dokter[] daftarDokter = new Dokter[2]; 

    RumahSakitt(String nama) {
        this.nama = nama;

        daftarRuangan[0] = new Ruangan ("R-01", 10); 
        daftarRuangan[1] = new Ruangan ("R-02", 15); 
    }

    void tambahDokter (Dokter dokter, int index) {
        daftarDokter[index] = dokter; 
    }

    void tampilkanRuangan() {
        System.out.println("DAFTAR RUANGAN" + nama );
        for (int i = 0; i < daftarRuangan.length; i++) {
            daftarRuangan[i].tampilkanInfo(); 
            System.out.println();
        }
    }
}
