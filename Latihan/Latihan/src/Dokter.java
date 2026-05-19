public class Dokter {
    String nama; 
    String spesialisasi; 

    Dokter(String nama, String spesialisasi) {
        this.nama = nama; 
        this.spesialisasi = spesialisasi; 
    }

    public void periksaPasien(Pasien pasien) {
        System.out.println("Pemeriksaan");
        System.out.println("Dokter : " + this.nama);
        System.out.println("Spesialisasi : " + this.spesialisasi);
        System.out.println("Pasien : " + pasien.nama);
        System.out.println("Umur : " + pasien.umur);
    }

    void tampilkanDokter() {
        System.out.println("Nama Dokter : " + nama);
        System.out.println("Spesialisasi :" + spesialisasi);
    }

}
