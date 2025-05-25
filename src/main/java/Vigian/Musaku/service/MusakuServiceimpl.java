package Vigian.Musaku.service;
import Vigian.Musaku.entity.Musaku;
import Vigian.Musaku.repository.MusakuRepository;
import Vigian.Musaku.repository.MusakuRepositoryimpl;





public class MusakuServiceimpl implements MusakuService {
    public MusakuServiceimpl(MusakuRepository musakuRepository) {
        this.musakuRepository = musakuRepository;
    }

    private MusakuRepository musakuRepository = new MusakuRepositoryimpl();
    private int totalPemasukan=0,
                totalPengeluaran=0;
    private int saldo=0;
    private final int batasPengeluaran = 50_000;

    @Override
    public void addPemasukan(String tipe, String keterangan, int pemasukan) {
        if (pemasukan > 0) {
            saldo += pemasukan;
            totalPemasukan += pemasukan;
            System.out.println("Pemasukan berhasil! Saldo saat ini: " + saldo+ " dari " +keterangan);
            musakuRepository.add( new Musaku(tipe,keterangan,pemasukan));
        } else {
            System.out.println("Pemasukan harus lebih dari 0!");
        }
    }

    @Override
    public void addPengeluaran(String tipe,String keterangan, int pengeluaran) {

        if (pengeluaran > 0) {
            if (saldo >= pengeluaran && pengeluaran <= batasPengeluaran) {
                saldo -= pengeluaran;
                totalPengeluaran += pengeluaran;
                System.out.println(tipe +"sebesar " + pengeluaran + " berhasil dicatat.");
                musakuRepository.add(new Musaku(tipe,keterangan,pengeluaran));
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
    public void showLaporan(){

        System.out.println("\n___ Laporan ___");
        System.out.println("Saldo saat ini: " + saldo);
        System.out.println("Total pemasukan: " + totalPemasukan);
        System.out.println("Total pengeluaran: " + totalPengeluaran);
        System.out.println("__history pengeluaran__");
        for (Object s : musakuRepository.getAll()) {
            System.out.println(s);
    }
}}
