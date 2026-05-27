package main;

import abstracts.Rekening;
import models.*;

import java.util.Scanner;

// Class Main sebagai program utama NeoBank
public class Main {

    public static void main(String[] args) {

    // Scanner untuk input user
        Scanner input = new Scanner(System.in);

     // Objek nasabah awalnya null
        Nasabah nasabah = null;

    // Membuat objek CustomerService
        CustomerService cs = new CustomerService();

        int pilih;

    // Perulangan menu program
        do {

            // Tampilan menu utama
            System.out.println("\n===== NEOBANK =====");
            System.out.println("1. Registrasi Nasabah");
            System.out.println("2. Buka Rekening");
            System.out.println("3. Setor");
            System.out.println("4. Tarik");
            System.out.println("5. Lihat Saldo");
            System.out.println("6. Customer Service");
            System.out.println("7. Keluar");

            System.out.print("Pilih menu : ");

            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {

                // Menu registrasi nasabah
                case 1:

                    System.out.print(
                            "Nama nasabah : "
                    );

                    String nama =
                            input.nextLine();

                    // Membuat objek Nasabah
                    nasabah =
                            new Nasabah(nama);

                    System.out.println(
                            "Nasabah berhasil dibuat"
                    );

                    break;

                // Menu membuka rekening
                case 2:

                    // Validasi nasabah harus ada
                    if (nasabah == null) {

                        System.out.println(
                                "Buat nasabah dahulu"
                        );

                        break;
                    }

                    System.out.println(
                            "1. Rekening Reguler"
                    );

                    System.out.println(
                            "2. Rekening Prioritas"
                    );

                    System.out.print(
                            "Pilih jenis : "
                    );

                    int jenis =
                            input.nextInt();

                    input.nextLine();

                    System.out.print(
                            "Nomor rekening : "
                    );

                    String norek =
                            input.nextLine();

                    System.out.print(
                            "Saldo awal : "
                    );

                    double saldo =
                            input.nextDouble();

                    System.out.print(
                            "PIN : "
                    );

                    int pin =
                            input.nextInt();

                    input.nextLine();

                    // Polymorphism:
                    // Objek Rekening dapat berupa Reguler/Prioritas
                    Rekening rekening;

                    if (jenis == 1) {

                        rekening =
                                new RekeningReguler(
                                        norek,
                                        nasabah.getNama(),
                                        saldo,
                                        pin
                                );

                    } else {

                        rekening =
                                new RekeningPrioritas(
                                        norek,
                                        nasabah.getNama(),
                                        saldo,
                                        pin
                                );
                    }

                    // Menambahkan rekening ke nasabah
                    nasabah.tambahRekening(
                            rekening
                    );

                    break;

                // Menu setor uang
                case 3:

                    if (nasabah == null) {

                        System.out.println(
                                "Belum ada nasabah"
                        );

                        break;
                    }

                    // Menampilkan daftar rekening
                    nasabah.tampilkanRekening();

                    System.out.print(
                            "Pilih rekening : "
                    );

                    int idxSetor =
                            input.nextInt();

                    // Memilih rekening dari array
                    Rekening rSetor =
                            nasabah.pilihRekening(
                                    idxSetor
                            );

                    if (rSetor != null) {

                        System.out.print(
                                "Masukkan PIN : "
                        );

                        int pinSetor =
                                input.nextInt();

                        // Verifikasi PIN
                        if (rSetor.verifikasiPIN(
                                pinSetor
                        )) {

                            System.out.print(
                                    "Jumlah setor : "
                            );

                            double jumlah =
                                    input.nextDouble();

                            // Memanggil method setor
                            rSetor.setor(jumlah);

                        } else {

                            System.out.println(
                                    "PIN salah"
                            );
                        }
                    }

                    input.nextLine();

                    break;

                // Menu tarik uang
                case 4:

                    if (nasabah == null) {

                        System.out.println(
                                "Belum ada nasabah"
                        );

                        break;
                    }

                    // Menampilkan daftar rekening
                    nasabah.tampilkanRekening();

                    System.out.print(
                            "Pilih rekening : "
                    );

                    int idxTarik =
                            input.nextInt();

                    Rekening rTarik =
                            nasabah.pilihRekening(
                                    idxTarik
                            );

                    if (rTarik != null) {

                        System.out.print(
                                "Masukkan PIN : "
                        );

                        int pinTarik =
                                input.nextInt();

                        // Verifikasi PIN
                        if (rTarik.verifikasiPIN(
                                pinTarik
                        )) {

                            System.out.print(
                                    "Jumlah tarik : "
                            );

                            double jumlah =
                                    input.nextDouble();

                            // Memanggil method tarik
                            rTarik.tarik(jumlah);

                        } else {

                            System.out.println(
                                    "PIN salah"
                            );
                        }
                    }

                    input.nextLine();

                    break;

                // Menu melihat saldo
                case 5:

                    if (nasabah == null) {

                        System.out.println(
                                "Belum ada nasabah"
                        );

                        break;
                    }

                    // Menampilkan daftar rekening
                    nasabah.tampilkanRekening();

                    System.out.print(
                            "Pilih rekening : "
                    );

                    int idxInfo =
                            input.nextInt();

                    Rekening rInfo =
                            nasabah.pilihRekening(
                                    idxInfo
                            );

                    if (rInfo != null) {

                        // Menampilkan info rekening
                        rInfo.infoRekening();
                    }

                    input.nextLine();

                    break;

                // Menu customer service
                case 6:

                    if (nasabah == null) {

                        System.out.println(
                                "Belum ada nasabah"
                        );

                        break;
                    }

                    System.out.print(
                            "Masukkan keluhan : "
                    );

                    String keluhan =
                            input.nextLine();

                    // Association:
                    // Nasabah berinteraksi dengan CS
                    nasabah.laporKeluhan(
                            cs,
                            keluhan
                    );

                    break;

                // Menu keluar
                case 7:

                    System.out.println(
                            "Program selesai"
                    );

                    break;

                default:

                    System.out.println(
                            "Menu tidak tersedia"
                    );
            }

        } while (pilih != 7);

        // Analisis OOP
        nasabah = null;

        input.close();
    }
}