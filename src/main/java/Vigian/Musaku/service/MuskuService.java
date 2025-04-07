package Vigian.Musaku.service;

public interface MuskuService {
    void addPemasukan(String type,String keterangan, int pemasukan);
    void addPengeluaran(String type,String keterangan, int pengeluaran);
    void showLaporan();
}
