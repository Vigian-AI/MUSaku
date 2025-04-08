package Vigian.Musaku.viewmusaku;

import Vigian.Musaku.service.MusakuService;
import Vigian.Musaku.util.InputUtil;



public class MusakuView {
    public MusakuView(MusakuService musakuService) {
        this.musakuService = musakuService;
    }

    private MusakuService musakuService;


    public MusakuView() {

    }


    public void showMenu(){
        while (true) {
            System.out.println("\n____ Manajemen Uang Saku ____");
            System.out.println("A. Pemasukan");
            System.out.println("B. Pengeluaran");
            System.out.println("C. Laporan");
            System.out.println("D. Keluar");
            String pilihan = InputUtil.inputstring("Pilih menu (A/B/C/D) ");


            if (pilihan.equalsIgnoreCase("A")) {
                showAddpemasukan();
            }
            else if (pilihan.equalsIgnoreCase("B")) {
               showAddpemasukan();
            }
            else if (pilihan.equalsIgnoreCase("C")) {
                musakuService.showLaporan();
            }
            else if (pilihan.equalsIgnoreCase("D")) {
                System.out.println("terima kasih program selesai");
                break;
            }
            else {
                System.out.println("Pilihan tidak valid. Silakan pilih A, B, C, atau D.");
            }
        }
    }
    public void showAddpengeluaran(){
        var ketPengeluaran = InputUtil.inputstring("masukan keterangan :");


        if (ketPengeluaran.trim().isEmpty()) {
            System.out.println("keterangan tidak boleh kosong");
            return;
        }else {
            var pengeluaran = InputUtil.inputInt("masukan pengeluaran");
            musakuService.addPengeluaran("pengeluaran",ketPengeluaran,pengeluaran);

        }
    }
    public void showAddpemasukan(){
        String ketPemasukan = InputUtil.inputstring("masukan keterangan: ");
        int pemasukan = InputUtil.inputInt("masukan nilai pemasukan ");
        musakuService.addPemasukan( "pemasukan",ketPemasukan,pemasukan);
    }
}
