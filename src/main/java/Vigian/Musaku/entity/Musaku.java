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

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Integer getUang() {
        return Uang;
    }

    public void setUang(Integer uang) {
        Uang = uang;
    }

    @Override
    public String toString() {
        return "type " + tipe +", keterangan " +keterangan+ ", jumlah "+Uang;
    }

}
