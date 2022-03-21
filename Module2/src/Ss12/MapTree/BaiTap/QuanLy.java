package Ss12.MapTree.BaiTap;

public class QuanLy {
    public QuanLy(String tenSanPham, String id, int giaSP) {
        this.tenSanPham = tenSanPham;
        this.id = id;
        this.giaSP = giaSP;
    }

    private String tenSanPham;
    private String id;
    private int giaSP;

    @Override
    public String toString() {
        return "QuanLy{" +
                "tenSanPham='" + tenSanPham + '\'' +
                ", id='" + id + '\'' +
                '}';
    }


    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public int getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(int giaSP) {
        this.giaSP = giaSP;
    }
    public String Update(String id){
        if(id == this.id){
            return this.id;
        }else
            throw  new IllegalArgumentException();
    }

}
