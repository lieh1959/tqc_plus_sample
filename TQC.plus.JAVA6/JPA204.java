/* TQC+ JAVA6 - 204 */

import java.util.*;

class JPA204 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
    }

    public static void test() {
    	System.out.println("Input:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //ʹ��and���\�㣬�K��ͬ�r����mod5=0��mod9=0�Ĕ��֣�ʹ��if���Д�ʽ����
        if((a%5)==0 && (a%9)==0)
        	System.out.printf("Yes\n");
        else
        	System.out.printf("No\n");
        }
}

