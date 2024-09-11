package TITV;

public class JAVA10_TypeCasting {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Ép kiểu ngầm định (Implicit Casting) từ int sang float
        // Do float có phạm vi lớn hơn int, việc ép kiểu này diễn ra tự động
        float c = a; // int -> float
        float d = b; // int -> float
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // Ép kiểu tường minh (Explicit Casting) từ float sang int
        // Khi ép kiểu tường minh từ kiểu lớn (float) sang kiểu nhỏ hơn (int),
        // phần thập phân sẽ bị mất
        float e = 3.5f;
        float f = 10.5f;

        int g = (int) e; // float -> int (phần thập phân bị mất, chỉ lấy phần nguyên)
        int h = (int) f; // float -> int
        System.out.println("g = " + g); // Sẽ in ra 3
        System.out.println("h = " + h); // Sẽ in ra 10
    }
}
