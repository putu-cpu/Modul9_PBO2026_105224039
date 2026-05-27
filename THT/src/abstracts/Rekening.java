package abstracts;

import interfaces.Otorisasi;
import models.BukuMutasi;

// Abstract class Rekening mengimplementasikan interface otorisasi
public abstract class Rekening implements Otorisasi {

      // Data rekening
    protected String nomorRekening;
    protected String namaPemilik;

     // Encapsulation dimna saldo dibuat private
    private double saldo;

    protected int pin;

    // Composition dimana setiap rekening otomatis memiliki BukuMutasi
    protected BukuMutasi mutasi;

    public Rekening(String nomorRekening,
                     String namaPemilik,
                     double saldoAwal,
                     int pin) {

        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldoAwal;
        this.pin = pin;

      // Objek BukuMutasi dibuat otomatis
        mutasi = new BukuMutasi();
    }

    // Getter no rek
    public String getNomorRekening() {
        return nomorRekening;
    }

        // Getter nama pemilik

    public String getNamaPemilik() {
    return namaPemilik;
    }

     // Getter saldo
    public double getSaldo() {
        return saldo;
    }

      // Metod protected untuk menambah saldo
    protected void tambahSaldo(double jumlah) {
        saldo += jumlah;
    }
    //untuk mengurangi saldo
    protected void kurangiSaldo(double jumlah) {
        saldo -= jumlah;
    }
    // Method setor uang
    public void setor(double jumlah) {

        tambahSaldo(jumlah);

        System.out.println("Setor berhasil");

        mutasi.catat("Setor Rp" + jumlah);
    }
    // Implementasi method dari interface Otorisasi
    @Override
    public boolean verifikasiPIN(int inputPIN) {
        return pin == inputPIN;
    }

    // Abstract method,  Akan dioverride oleh RekeningReguler dan RekeningPrioritas
    public abstract void tarik(double jumlah);

    // tampil inforekening
    public void infoRekening() {

        System.out.println("No Rekening : " + nomorRekening);
        System.out.println("Nama        : " + namaPemilik);
        System.out.println("Saldo       : Rp" + saldo);
    }
}
