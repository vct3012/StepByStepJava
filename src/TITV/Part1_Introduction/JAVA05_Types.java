package TITV.Part1_Introduction;

public class JAVA05_Types {
    public static void main(String[] args) {
        String tenHocSinh = "Vong Chu Tan";
        int namSinh = 2003;
        double kinhTe = 222.350;
        boolean conSong = true;

        char Id = 'M';

        // In thông tin của học sinh
        System.out.println("ten hoc sinh " + tenHocSinh
                + " nam sinh " + namSinh
                + " Con song hay khong? " + (conSong ? "Con song" : "Khong con song")
                + " Gioi tinh: " + (Id == 'M' ? "Nam" : "Nu"));
    }
}
