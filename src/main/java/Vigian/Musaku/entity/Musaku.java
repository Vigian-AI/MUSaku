package Vigian.Musaku.entity;

public class Musaku {
    private String tipe;
    private String keterangan;
    private Integer Uang;
    private Integer id;

    public Integer getId() {
        return id;
    }


    public String getTipe() {
        return tipe;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public Integer getUang() {
        return Uang;
    }

    public Musaku(Integer id,String tipe, String keterangan, Integer uang) {
        this.id = id;
        this.tipe = tipe;
        this.keterangan = keterangan;
        this.Uang = uang;
    }


}
