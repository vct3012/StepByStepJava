package TITV.Part3_ConditionStatement_Loop_Array;
import java.util.Scanner;

public class JAVA25_DoWhile_Basic {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao n>0");
            n = sc.nextInt();
        }while(n<=0);
    }
}
