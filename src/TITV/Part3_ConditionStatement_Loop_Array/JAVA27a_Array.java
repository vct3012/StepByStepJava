package TITV.Part3_ConditionStatement_Loop_Array;

import java.util.Scanner;

public class JAVA27a_Array {
    public static void main(String[] args) {
        double[] mang1;
        double[] mang2;

        mang1 = new double[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mang1.length; i++) {
            System.out.println("nhap phan tu thu"+i+":");
            mang1[i] = sc.nextDouble();

        }
        double tong = 0;
        for (int i = 0; i < mang1.length; i++) {
            tong += mang1[i];

        }
        System.out.println("Tong = " + tong);
    }
}
