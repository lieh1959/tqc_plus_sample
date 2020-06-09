/* TQC+ JAVA6 - 206 */

import java.util.*;

public class JPA206 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        test();
        test();
    }

    static void test() {
        int chi, eng, math;

        System.out.print("Input Chinese score:");
        chi = keyboard.nextInt();
        System.out.print("Input English score:");
        eng = keyboard.nextInt();
        System.out.print("Input Math score:");
        math = keyboard.nextInt();

        //使用四個if個別獨立去判斷，個別的分數是否不及格
        if(chi<60)
            System.out.printf("Chinese failed.\n");
        if(eng<60)
            System.out.printf("English failed.\n");
        if(math<60)
            System.out.printf("Math failed.\n");
        if(chi>60 && eng>60 && math>60)
            System.out.printf("All pass.\n");
    }
}