package CaseStudy.Model;

import CaseStudy.Model.Facility;

import java.util.Date;

public class Room extends Facility {
    public Room() {
    }

    public Room(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public Room(double dienTich, double chiPhiThue, int soLuongNguoiMax, Date kieuThue, String dichVuMienPhiDiKem) {
        super(dienTich, chiPhiThue, soLuongNguoiMax, kieuThue);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    private String dichVuMienPhiDiKem;

}
