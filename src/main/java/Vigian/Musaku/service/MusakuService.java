package Vigian.Musaku.service;

public interface MusakuService {


    void addPemasukan(String type, String keterangan, int pemasukan);

    void addPengeluaran(String type, String keterangan, int pengeluaran);
    void showLaporan();
}
