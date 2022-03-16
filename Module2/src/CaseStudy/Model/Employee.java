package CaseStudy.Model;

import java.util.Date;

public class Employee extends Person {
    public Employee() {
    }

    public Employee(String maNhanVien, String trinhDo, String viTri, int luong) {
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public Employee(String maNhanVien, String hoTen, Date ngaySinh, String gioiTinh, int soCMND, int soDienThoai, String email, String trinhDo, String viTri, int luong) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    //Trình độ, Vị trí, lương
    private String maNhanVien;
    private String trinhDo;
    private String viTri;
    private int luong;

}
