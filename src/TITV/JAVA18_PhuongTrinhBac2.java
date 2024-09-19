package TITV;

import java.util.Scanner;

public class JAVA18_PhuongTrinhBac2 {
    public static void main(String[] args) {
        //ax^2 + bx + c = 0
        //delta = b^2 - 4ac
        //=> delta < 0 = phuong trinh vo nghiem
        // delta == 0 . phuong trinh co nghiem kep, x1 = x2 == -b/2a
        // delta > 0 => phuong trinh co 2 nghiem
        // x1 = (-b - sqrt(delta)) / (2a)
        // x2 = (-b + sqrt(delta)) / (2a)
        double a, b, c, x1, x2, delta;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao a = ");
        a = sc.nextDouble();
        System.out.println("Nhap vao b = ");
        b = sc.nextDouble();
        System.out.println("Nhap vao c = ");
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        if (a == 0) {
            System.out.println("Nhập dữ liệu sai!");
        } else {
            if (delta < 0) {
                // Tinh huong delta<0
                System.out.println("Phương trình vô nghiệm!");
            } else if (delta == 0) {
                // Tinh huong delta==0
                x1 = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép x1=x2=" + x1);
            } else {
                // Tinh huong delta>0
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có nghiệm");
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            }
        }
    }
}
