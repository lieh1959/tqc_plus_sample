/* TQC+ JAVA6 - 202 */

import java.util.*;

class JPA202{
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
       	test();
        test();
    }

    public static void test() {
    	System.out.println("Input:");
        Scanner sc = new Scanner(System.in);
        int a,b;

        a = sc.nextInt();
        b = sc.nextInt();
        //�إ߱���P�_���A���G�i�঳�T�ت��p�Aa>b�Aa=b�Aa<b�A�ҥH�P�_���B�z�p�U
        if(a>b)
        	System.out.printf("%d is larger than %d\n",a,b);
        else if(b>a)
        	System.out.printf("%d is larger than %d\n",b,a);
        else
        	System.out.printf("%d is equal to %d\n",a,b);
    }
}
