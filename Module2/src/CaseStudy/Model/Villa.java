package CaseStudy.Model;

import CaseStudy.Model.Facility;

import java.util.Date;

public class Villa extends Facility {
    private String tieuChuanPhong;

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    private double dienTichHoBoi;
    private int soTang;
    public Villa(){}
    public Villa(String tieuChuanPhong, double dienTichHoBoi, int soTang){
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }
    public Villa(String tieuChuanPhong, double dienTichHoBoi, int soTang,double dienTich, double chiPhiThue, int soLuongNguoiMax, Date kieuThue){
        super(dienTich,dienTich,soLuongNguoiMax,kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }
}
