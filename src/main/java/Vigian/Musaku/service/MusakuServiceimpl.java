package Vigian.Musaku.service;

import Vigian.Musaku.entity.Musaku;
import Vigian.Musaku.repository.MusakuRepository;
import Vigian.Musaku.repository.MusakuRepositoryimpl;


import java.util.List;


public class MusakuServiceimpl implements MuskuService{
    private MusakuRepository musakuRepository = new MusakuRepositoryimpl();
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
