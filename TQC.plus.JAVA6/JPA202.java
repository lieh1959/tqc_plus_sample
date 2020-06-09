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
        //建立條件判斷式，結果可能有三種狀況，a>b，a=b，a<b，所以判斷式處理如下
        if(a>b)
        	System.out.printf("%d is larger than %d\n",a,b);
        else if(b>a)
        	System.out.printf("%d is larger than %d\n",b,a);
        else
        	System.out.printf("%d is equal to %d\n",a,b);
    }
}
