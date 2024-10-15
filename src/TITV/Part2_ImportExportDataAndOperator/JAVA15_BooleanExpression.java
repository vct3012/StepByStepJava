package TITV.Part2_ImportExportDataAndOperator;

import java.util.Scanner;

public class JAVA15_BooleanExpression {
    public static void main(String[] args) {
        Scanner NTBP = new Scanner(System.in);
        System.out.println("Nhap a = ");
        int a = NTBP.nextInt();

        String ketQua = (a%2==0)?"So chan":"so le";
        System.out.println(a + " la " +  ketQua);
    }
}
