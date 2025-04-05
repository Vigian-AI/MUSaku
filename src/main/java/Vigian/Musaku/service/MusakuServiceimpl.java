package Vigian.Musaku.service;

public class MusakuServiceimpl implements MuskuService{
    private int pemasukan, pengeluaran;
    private int totalPemasukan, totalPengeluaran;
    private int saldo;
    private final int batasPengeluaran = 50_000;

    @Override
    public void addPemasukan() {
        System.out.print("Masukkan jumlah pemasukan uang saku: ");

        if (pemasukan > 0) {
            saldo += pemasukan;
            totalPemasukan += pemasukan;
            System.out.println("Pemasukan berhasil! Saldo saat ini: " + saldo);
        } else {
            System.out.println("Pemasukan harus lebih dari 0!");
        }
    }

    @Override
    public void addPengeluaran() {
        System.out.println("masukan keterangan pengeluaran:");


        if (ketpengeluran.trim().isEmpty()) {
            System.out.println("keterangan tidak boleh kosong");
            return;
        }

        System.out.print("Masukkan jumlah pengeluaran: ");


        if (pengeluaran > 0) {
            if (saldo >= pengeluaran && pengeluaran <= batasPengeluaran) {
                saldo -= pengeluaran;

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

    @Override
    public void showLaporan() {

    }
}
