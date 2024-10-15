package TITV.Part2_ImportExportDataAndOperator;

public class JAVA12_UnaryOperations {
    public static void main(String[] args) {
        int a= 5;
        boolean b= false;
        System.out.println("test: " + a++ ); // In ra a roi cong / =6
        System.out.println("test: " + a-- ); // In ra a roi tru / =5

        System.out.println("---------------------");
        System.out.println("Gia tri phep cong: " + (++a)); //cong roi in ra / =6
        System.out.println("Gia tri phep tru: " + (--a)); // =5
        System.out.println("Gia tri cua bien b la: " + (!b));


    }
}
