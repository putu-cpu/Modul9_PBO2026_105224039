package models;

import abstracts.Rekening;
// Class Nasabah untuk menyimpan data nasabah
public class Nasabah {
 // Nama nasabah
    private String nama;

    // Aggregation
     // Nasabah dapat memiliki maksimal 3 rekening
    private Rekening[] daftarRekening =
            new Rekening[3];

    private int jumlahRekening = 0;
  // Constructor nasabah
    public Nasabah(String nama) {

        this.nama = nama;

    }
// Getter nama nasabah
    public String getNama() {

        return nama;

    }
 // Metode untuk menambahkan rekening
    public void tambahRekening(Rekening rekening) {

        if (jumlahRekening < 3) {

            daftarRekening[jumlahRekening] =
                    rekening;

            jumlahRekening++;

            System.out.println(
                    "Rekening berhasil ditambahkan"
            );

        } else {

            System.out.println(
                    "Maksimal 3 rekening"
            );
        }
    }
// Metode memilih rekening berdasarkan index
    public Rekening pilihRekening(int index) {

        if (index >= 0 &&
                index < jumlahRekening) {

            return daftarRekening[index];
        }

        return null;
    }
 // Metode tampil daftar rekening
    public void tampilkanRekening() {

        for (int i = 0;
             i < jumlahRekening;
             i++) {

            System.out.println(
                    i + ". " +
                    daftarRekening[i]
                            .getNomorRekening()
            );
        }
    }

    // Association
    // Nasabah dapat berinteraksi dengan CustomerService
    public void laporKeluhan(
            CustomerService cs,
            String keluhan) {

        cs.terimaKeluhan(
                nama,
                keluhan
        );
    }
}