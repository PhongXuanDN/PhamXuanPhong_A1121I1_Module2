package CaseStudy;

import java.util.Date;

public class DichVu {
    private String tenDichVu;

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoiMax() {
        return soLuongNguoiMax;
    }

    public void setSoLuongNguoiMax(int soLuongNguoiMax) {
        this.soLuongNguoiMax = soLuongNguoiMax;
    }

    public Date getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(Date kieuThue) {
        this.kieuThue = kieuThue;
    }

    private double dienTich = 1.0;
    private double chiPhiThue;
    private int soLuongNguoiMax;
    private Date kieuThue;
    public DichVu(){}
    public DichVu(double dienTich, double chiPhiThue, int soLuongNguoiMax, Date kieuThue){
        this.dienTich = dienTich;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiMax = soLuongNguoiMax;
        this.kieuThue = kieuThue;
    }

}
