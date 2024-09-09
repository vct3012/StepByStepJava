package TITV;

import java.util.Scanner;

public class JAVA09_Scanner {
    public static void main(String[] args) {
        Scanner NhapTuBanPhim = new Scanner(System.in);
        System.out.println("Nhap tu ban phim: ");
        String nhapCaiGiCungDuoc = NhapTuBanPhim.nextLine();

        System.out.println("Nhap so tuoi: ");
        Integer nhapTuoi = NhapTuBanPhim.nextInt();

    }
}
