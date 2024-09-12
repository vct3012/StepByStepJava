package TITV;

import java.util.Scanner;

public class JAVA13_Comparison {
    public static void main(String[] args) {
        Scanner NTPB = new Scanner(System.in);
        int a,b;
        System.out.println("Nhap a = ");
        a = NTPB.nextInt();
        System.out.println("Nhap b = ");
        b = NTPB.nextInt();

        //Xuat ra kqua so sanh
        System.out.println(a + " = " +b + (a==b) );
    }
}
