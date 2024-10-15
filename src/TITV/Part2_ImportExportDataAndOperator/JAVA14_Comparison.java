package TITV.Part2_ImportExportDataAndOperator;

import java.util.Scanner;

public class JAVA14_Comparison {
    public static void main(String[] args) {
        Scanner NTPB = new Scanner(System.in);
        float c;
        System.out.println("Nhap c = ");
        c = NTPB.nextFloat();
        System.out.println("c = " + c);

        c += 3;
        System.out.println("c2 = " + c);
        c -= 2;
        System.out.println("c3 = " + c);
        c /= 3;
        System.out.println("c4 = " + c);
        c %= 3;
        System.out.println("c5 = " + c);


    }
}
