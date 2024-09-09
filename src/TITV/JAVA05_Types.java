package TITV;

import java.lang.reflect.Type;

public class JAVA05_Types {
    public static void main(String[] args) {
//        final byte tan = 1;
//        System.out.println(tan);

        String tenHocSinh = "Vong Chu Tan";
        int namSinh = 2003;
        double kinhTe = 222.350;
        boolean conSong = true;


        if (conSong == true) {
            System.out.println("Con song");
        }

        char Id = 'M';
        if (Id == 'M') {
            System.out.println("Nam");
        }

        System.out.println("ten hoc sinh " + tenHocSinh
        + " nam sinh " + namSinh + " Con song hay khong? " + conSong + " char" + Id );


    }
}
