package TITV.Part4_LapTrinhHuongDoiTuong;

public class JAVA31_HoaDonCaPhe {
    private String tenLoaiCaPhe;
    private double giaTien1Kg;
    private double khoiLuong;

    public JAVA31_HoaDonCaPhe(String ten, double gia, double kl) {
        this.tenLoaiCaPhe = ten;
        this.giaTien1Kg = gia;
        this.khoiLuong = kl;
    }

    public double tinhTongTien() {
        return this.giaTien1Kg * this.khoiLuong;
    }

    public boolean kiemTraKhoiLuongLonHon(double kl) {
        return this.khoiLuong > kl;
    }

    public boolean kiemTraTongTienLonHon500K() {
        return this.tinhTongTien() > 500000;
    }

    public double giamGia(double x) {
        if (this.tinhTongTien() > 500000) {
            return (x / 100) * this.tinhTongTien();
        } else {
            return 0;
        }
    }

    public double giaSauKhiGiam(double x) {
        return this.tinhTongTien() - this.giamGia(x);
    }
}
