package TITV;

import java.util.Scanner;

public class JAVA24_Binary {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen n>0: ");
        n = scanner.nextInt();
        String nhiPhan = "abc";
            while (n > 0){
                nhiPhan = (n%2) + nhiPhan; // n = 5 , 5%2 = 2 du 1 , "1abc "
                n = n/2;
            }
        System.out.println("He nhi phan cua so vua nhap la: " + nhiPhan);

    }
}
