package javaClass.Bai3;
import java.util.Date;

public class HangHoa {
    public HangHoa(){}
    public HangHoa(int maHang,String ten,int donggia,Date ngaySanXuat,Date ngayHetHan){
        this.maHang = maHang;
        this.ten = ten;
        this.donggia = donggia;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }
    private int maHang;
    private String ten;
    private int donggia;
    private Date ngaySanXuat;
    private Date ngayHetHan;

    @Override
    public String toString() {
        return "HangHoa{" +
                "maHang='" + maHang + '\'' +
                ", ten='" + ten + '\'' +
                ", dongia=" + donggia +
                ", ngaySanXuat=" + ngaySanXuat +
                ", ngayHetHan=" + ngayHetHan +
                '}';
    }

    public int getMaHang() {
        return maHang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getDonggia() {
        return donggia;
    }

    public void setDonggia(int dongia) {
        this.donggia = dongia;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
}