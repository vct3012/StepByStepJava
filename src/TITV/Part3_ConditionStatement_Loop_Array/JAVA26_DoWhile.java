package TITV.Part3_ConditionStatement_Loop_Array;

public class JAVA26_DoWhile {
//    public static void main(String[] args) {
//        int out, in = 0;
//        for (out = 0; out < 10; out++) {
//            for (in = 0; in < 20; in++) {
//                if (in > 10)
//                    break;
//            }
//            System.out.println("ben trong vong lap out: out = " + out + ", in = " + in);
//        }
//        System.out.println("ben ngoai vong lap out: out = " + out + ", in = " + in);
//    }

    public static void main(String[] args) {
        int out, in = 0;
        outer: for (out = 0; out < 10; out++) {
            for (in = 0; in < 20; in++) {
                if (in > 10)
                    break outer;
            }
            System.out.println("ben trong vong lap out: out = " + out + ", in = " + in);
        }
        System.out.println("ben ngoai vong lap out: out = " + out + ", in = " + in);
    }
}
