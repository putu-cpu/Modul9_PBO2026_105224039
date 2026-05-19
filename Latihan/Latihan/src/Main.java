public class Main {
   
    public static void main(String[] args) throws Exception {
        Dokter dokter1 = new Dokter ("Dr.Tirta", "Penyakit Dalam");
        Dokter dokter2 = new Dokter ("Dr.Murphy", "Penyakit Jantung");

        Pasien pasien1 = new Pasien("Andre", 20);
        Pasien pasien2 = new Pasien("Soma", 13);

        dokter1.periksaPasien(pasien1);
        dokter2.periksaPasien(pasien2); 

        RumahSakitt rs  =  new RumahSakitt ("RS Sehat Selalu"); 

        rs.tambahDokter(dokter1, 0); 
        rs.tambahDokter(dokter2, 1); 

        rs.tampilkanRuangan(); 

        rs= null; 

        System.out.println("SETELAH RUMAH SAKIT DIHAPUS");
        System.out.println("Rumah sakit sudah null");

        dokter1.tampilkanDokter(); 
        dokter2.tampilkanDokter(); 
    
    }
}
