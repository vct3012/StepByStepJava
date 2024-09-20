package TITV;

import java.util.Scanner;

public class JAVA19_SwitchCase {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen tu 0 den 8");
        n = sc.nextInt();

        switch (n) {
            case 2: {
                System.out.println("thu 2");
                break;
            }
            case 3: {
                System.out.println("thu 3");
                break;

            }
            case 4: {
                System.out.println("thu 4");
                break;

            }
            case 5: {
                System.out.println("thu 5");
                break;

            }
            case 6: {
                System.out.println("thu 6");
                break;

            }
            case 7: {
                System.out.println("thu 7");
                break;

            }
            case 8: {
                System.out.println("thu 8s      ");
                break;

            }

            default:
            System.out.println("Khong co so trong do");

        }
    }
}
