public class Ruangan {
    String nomorRegistrasi; 
    int kapasitas; 

    Ruangan(String nomorRegistrasi, int kapasitas) {
        this.nomorRegistrasi = nomorRegistrasi; 
        this.kapasitas = kapasitas; 
    }

    void tampilkanInfo() {
        System.out.println("Nomor Ruangan :" + nomorRegistrasi);
        System.out.println("Kapasitas : " + kapasitas + "pasien") ;
    }
}
