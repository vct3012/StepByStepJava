package TITV.Part3_ConditionStatement_Loop_Array;
import java.util.Scanner;

public class JAVA27_TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        try {
            System.out.println("Nhap vao so nguyen n: ");
            n = sc.nextInt();
        } catch (Exception abc) {
            System.out.println("Nhập dữ liệu không đúng");
        } finally {
            System.out.println("Finally!");
        }
        System.out.println("Gia tri nhap la: "+n);
        System.out.println("Ket thuc chuong trinh");
    }
}