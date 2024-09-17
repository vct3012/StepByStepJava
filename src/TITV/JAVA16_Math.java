package TITV;

import java.util.Scanner;

public class JAVA16_Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.println("nhap vao so a: ");
        a = sc.nextDouble();
        System.out.println("nhap vao so b: ");
        b = sc.nextDouble();

        //Ham tri tuyet doi
        System.out.println("Tri tuyet doi cua a => |a| = " + Math.abs(a));

        //Ham tim min
        System.out.println("Min cua (a,b) thi = " + Math.min(a, b));

        //Ham tim max
        System.out.println("Max cua (a,b) thi = " + Math.max(a, b));

        //Ham ceil
        System.out.println("ceil(a) = " + Math.ceil(a));

        //Ham floor
        System.out.println("floor(a) = " + Math.floor(a));

        //Ham can bac 2 => sqrt
        System.out.println("floor(a) = " + Math.sqrt(a));

        //Ham luy thua => a^b
        System.out.println("a^b" + Math.pow(a, b));


    }
}
