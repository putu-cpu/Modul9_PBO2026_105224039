package models;

import abstracts.Rekening;
// Class RekeningReguler merupakan turunan dari Rekening
public class RekeningReguler extends Rekening {
 // Biaya admin setiap penarikan
    private final double biayaAdmin = 2500;
 // Constructor RekeningReguler
    public RekeningReguler(String nomorRekening,
                           String namaPemilik,
                           double saldoAwal,
                           int pin) {
// Memanggil constructor parent class
        super(nomorRekening,
              namaPemilik,
              saldoAwal,
              pin);
    }
   // Polymorphism
    // Override method tarik() dari class Rekening
    @Override
    public void tarik(double jumlah) {
// Total penarikan + biaya admin
        double total = jumlah + biayaAdmin;
// Validasi saldo cukup
        if (getSaldo() >= total) {
// Mengurangi saldo
            kurangiSaldo(total);

            System.out.println("Penarikan berhasil");
            System.out.println("Biaya admin : Rp" + biayaAdmin);
 // Mencatat transaksi ke mutasi
            mutasi.catat(
                    "Tarik Rp" + jumlah +
                    " + admin Rp" + biayaAdmin
            );

        } else {

            System.out.println("Saldo tidak cukup");
        }
    }
}