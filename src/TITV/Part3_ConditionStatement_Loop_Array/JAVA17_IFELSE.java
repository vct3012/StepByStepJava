package TITV.Part3_ConditionStatement_Loop_Array;

import java.util.Scanner;

public class JAVA17_IFELSE {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so n vao: ");
        n = scanner.nextInt();

        //If kieu tra chan le
        if(n%2 == 0){
            System.out.println(n + " n la so chan");
        }else {
            System.out.println(n + " n la so le");
        }
    }
}