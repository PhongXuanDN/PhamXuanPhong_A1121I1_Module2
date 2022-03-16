package CaseStudy.Model;

import CaseStudy.Model.Facility;

import java.util.Date;

public class House extends Facility {
    public House() {
    }

    public House(String tieuChuanPhong, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public House(double dienTich, double chiPhiThue, int soLuongNguoiMax, Date kieuThue, String tieuChuanPhong, int soTang) {
        super(dienTich, chiPhiThue, soLuongNguoiMax, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    private String tieuChuanPhong;
    private int soTang;

}
