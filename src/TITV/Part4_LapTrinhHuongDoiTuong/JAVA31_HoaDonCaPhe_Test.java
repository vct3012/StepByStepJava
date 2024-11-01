package TITV.Part4_LapTrinhHuongDoiTuong;

public class JAVA31_HoaDonCaPhe_Test {
    public static void main(String[] args) {
        JAVA31_HoaDonCaPhe hd = new JAVA31_HoaDonCaPhe("Trung Nguyen", 100000, 1.5);
        JAVA31_HoaDonCaPhe hd2 = new JAVA31_HoaDonCaPhe("Trung Nguyen", 100000, 5.5);

        System.out.println("Tong tien Hd: " + hd.tinhTongTien());
        System.out.println("Tong tien Hd2: " + hd2.tinhTongTien());
        System.out.println("Kiem tra khoi luong > 2kg: " + hd.kiemTraKhoiLuongLonHon(2));
        System.out.println("Kiem tra khoi luong > 1kg: " + hd.kiemTraKhoiLuongLonHon(1));
        System.out.println("Kiem tra tong tien > 500k: " + hd.kiemTraTongTienLonHon500K());
        System.out.println("Giam gia cua Hd: " + hd.giamGia(10));
        System.out.println("Giam gia cua Hd2: " + hd2.giamGia(10));
        System.out.println("Sau giam gia cua Hd: " + hd.giaSauKhiGiam(10));
        System.out.println("Sau giam gia cua Hd2: " + hd2.giaSauKhiGiam(10));
    }
}
