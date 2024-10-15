package TITV.Part3_ConditionStatement_Loop_Array;

import java.util.Scanner;

public class JAVA17_IFELSE_PhuongTrinhBac1 {
    public static void main(String[] args) {
        //ax + b = 0
        // b = 0 => pt vo so nghiem
        // b != 0 => pt ko co nghiem
        // a != 0 => nghiem x = -b/a

        double a, b, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap con so a: ");
        a = sc.nextDouble();
        System.out.println("Nhap con so b: ");
        b = sc.nextDouble();

        if (a == 0) {
            //tinh huong a = 0

            if (b == 0) {
                // Tinh huong b = 0
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                //tinh huong a = 0 va b != 0;
                System.out.println("Phuong trinh vo nghiem");

            }
        } else {
            // a != 0
            x = -b / a;
            System.out.println("nghiem x = " + x);

        }
    }
}
