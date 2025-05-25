package Vigian.Musaku;
import java.util.ArrayList;
import java.util.Scanner;

public class versi1{
        static int pemasukan, pengeluaran;
        static int totalPemasukan = 0;
        static int totalPengeluaran = 0;
        static int saldo = 0;
        static int batasPengeluaran = 50_000;
        static ArrayList<String> KeteranganPengeluaran = new ArrayList<>();
        static Scanner scanner = new Scanner(System.in);
        static int nomer =0;

        private static void tampilkanMenu() {
            System.out.println("\n____ Manajemen Uang Saku ____");
            System.out.println("A. Pemasukan");
            System.out.println("B. Pengeluaran");
            System.out.println("C. Laporan");
            System.out.println("D. Keluar");
            System.out.print("Pilih menu (A/B/C/D): ");
        }

        private static void catatPemasukan() {
            System.out.print("Masukkan jumlah pemasukan uang saku: ");
            pemasukan = scanner.nextInt();
            scanner.nextLine();
            if (pemasukan > 0) {
                saldo += pemasukan;
                totalPemasukan += pemasukan;
                System.out.println("Pemasukan berhasil! Saldo saat ini: " + saldo);
            } else {
                System.out.println("Pemasukan harus lebih dari 0!");
            }
        }

        private static void catatPengeluaran() {
            System.out.println("masukan keterangan pengeluaran:");
            String ketpengeluran = scanner.next();

            if (ketpengeluran.trim().isEmpty()) {
                System.out.println("keterangan tidak boleh kosong");
            return;
            }

            System.out.print("Masukkan jumlah pengeluaran: ");
            pengeluaran = scanner.nextInt();
            scanner.nextLine();
            if (pengeluaran > 0) {
                if (saldo >= pengeluaran && pengeluaran <= batasPengeluaran) {
                    saldo -= pengeluaran;
                    nomer ++;
                    KeteranganPengeluaran.add(nomer +". "+ " Rp " + pengeluaran+" untuk "+ ketpengeluran);
                    totalPengeluaran += pengeluaran;
                    System.out.println("Pengeluaran sebesar " + pengeluaran + " berhasil dicatat.");
                    System.out.println("Sisa saldo: " + saldo);
                } else if (pengeluaran > batasPengeluaran) {
                    System.out.println("Peringatan: Pengeluaran melebihi batas yang ditentukan!");
                } else {
                    System.out.println("Saldo tidak mencukupi untuk pengeluaran ini!");
                }
            } else {
                System.out.println("Pengeluaran harus lebih dari 0!");
            }
        }

        private static void tampilkanLaporan() {
            System.out.println("\n___ Laporan ___");
            System.out.println("Saldo saat ini: " + saldo);
            System.out.println("Total pemasukan: " + totalPemasukan);
            System.out.println("Total pengeluaran: " + totalPengeluaran);
            System.out.println("__history pengeluaran__");
            for (String s : KeteranganPengeluaran) {
                System.out.println(s);
            }
        }

        private static void keluar() {
            System.out.println("Terima kasih! Program selesai.");
        }

        public static void main(String[] args) {
            while (true) {

                String pilihan;
                tampilkanMenu();

                pilihan = scanner.next();
                if (pilihan.equalsIgnoreCase("A")) {
                    catatPemasukan();
                }
                else if (pilihan.equalsIgnoreCase("B")) {
                    catatPengeluaran();
                }
                else if (pilihan.equalsIgnoreCase("C")) {
                    tampilkanLaporan();
                }
                else if (pilihan.equalsIgnoreCase("D")) {
                    keluar();
                    break;
                }
                else {
                    System.out.println("Pilihan tidak valid. Silakan pilih A, B, C, atau D.");
                }
            }
        }
    }

