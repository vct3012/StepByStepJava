package TITV.Part2_ImportExportDataAndOperator;

import java.util.Scanner;

public class JAVA13_Assignment {
    public static void main(String[] args) {
        Scanner NTBP = new Scanner(System.in);
        float a = 5;

        System.out.println("Enter the value of a: ");

        //Các phép gán
        a= NTBP.nextFloat();
        System.out.println("a: " + a );

        a+=3; // a = a + 3
        System.out.println("a: "+a);

        a-=2;
        System.out.println("a: "+a);

        a*=3;
        System.out.println("a: "+a);
    }
}
