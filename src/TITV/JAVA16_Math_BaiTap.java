package TITV;

import java.util.Scanner;

public class JAVA16_Math_BaiTap {
    public static void main(String[] args) {
        double r, dienTich, chuVi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ban kinh hinh tron: ");
        r = sc.nextDouble();

        chuVi = r * 2 * Math.PI;
        System.out.println("chu vi hinh tron la " + Math.round(chuVi));

        dienTich = Math.PI * Math.pow(r, 2);
        System.out.println("dien tich hinh tron la " + Math.round(dienTich));

    }
}
