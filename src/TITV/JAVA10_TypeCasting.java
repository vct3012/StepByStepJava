package TITV;

public class JAVA10_TypeCasting {
    public static void main(String[] args) {
        int a= 100;
        int b= 200;
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        //ép kiểu ngầm định (implicit casting),
        float c = a;
        float d = b;
        System.out.println("c = "+c);
        System.out.println("d = "+d);

        //
        float e =  3.5;
        float f = 10.5;

        int g = (int)e;
        int h = (int)g;

        System.out.println("g = "+g);
        System.out.println("h = "+h);


    }
}
