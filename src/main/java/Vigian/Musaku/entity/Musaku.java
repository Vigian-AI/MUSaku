package Vigian.Musaku.entity;

public class Musaku {
    private String tipe;
    private String keterangan;
    private Integer Uang;



    public Musaku(String tipe, String keterangan, Integer uang) {
        this.tipe = tipe;
        this.keterangan = keterangan;
        this.Uang = uang;
    }

    @Override
    public String toString() {
        return "type " + tipe +", keterangan " +keterangan+ ", jumlah "+Uang;
    }

}
