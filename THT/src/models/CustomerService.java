package models;

// Class CustomerService untuk menerima keluhan nasabah
public class CustomerService {
// Metode untuk terima laporan keluhan
    public void terimaKeluhan(
            String namaNasabah,
            String keluhan) {

        System.out.println("\n=== CUSTOMER SERVICE ===");
 // tampil nama nasabah
        System.out.println(
                "Nasabah : " + namaNasabah
        );
 // keluhannya apa
        System.out.println(
                "Keluhan : " + keluhan
        );
// Konfirmasi keluhan diterima
        System.out.println(
                "Keluhan diterima"
        );
    }
}
