package TITV.Part2_ImportExportDataAndOperator;

import java.util.Scanner;

public class JAVA11_Operator    {
    public static void main(String[] args) {
        // Khai bao bien
        int a, b;

        //Scanner
        Scanner NTBP = new Scanner(System.in);
        System.out.println("Nhap a vao: ");
        a = NTBP.nextInt();
        System.out.println("Nhap b vao: ");
        b = NTBP.nextInt();

        //Operator

        int tong = a+b;
        int tru  = a-b;
        int nhan = a*b;
        float chia = (float)a/b;
        int layDu = a%b;

        System.out.println("Tong cua hai so la: " + tong);
        System.out.println("Tru cua hai so la: " + tru);
        System.out.println("Nhan cua hai so la: " + nhan);
        System.out.println("Chia cua hai so la: " + chia);
        System.out.println("Lay du cua hai so la: " + layDu);


    }
}
