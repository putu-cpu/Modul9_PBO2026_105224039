package models;

import abstracts.Rekening;
// Class RekeningPrioritas merupakan turunan dari Rekening
public class RekeningPrioritas extends Rekening {
// Batas minimum penarikan
    private final double minimumPenarikan = 500000;
   // Constructor RekeningPrioritas
    public RekeningPrioritas(String nomorRekening,
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
// Validasi minimum penarikan
        if (jumlah < minimumPenarikan) {

            System.out.println(
                    "Minimal penarikan Rp500000"
            );

            return;
        }
 // Validasi saldo cukup
        if (getSaldo() >= jumlah) {

            kurangiSaldo(jumlah);

            System.out.println(
                    "Penarikan berhasil tanpa biaya admin"
            );
 // Mencatat transaksi ke mutasi
            mutasi.catat(
                    "Tarik Rp" + jumlah
            );

        } else {

            System.out.println("Saldo tidak cukup");
        }
    }
}
