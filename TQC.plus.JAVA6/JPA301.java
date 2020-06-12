/* TQC+ JAVA6 - 301 */

import java.util.*;

class JPA301 {
    public static void main(String argv[]) {
        System.out.println("Input:");
        int tm =new Scanner(System.in).nextInt();
        int sum = 0 ;
        //從1開始加，且變數會一直+1再加入總和，直到變數大於使用者輸入的數便停止
        for (int a=1;a<=tm ; a++) {
            sum = sum+a;
        }
        System.out.printf("1 + ... + %d = %d",tm,sum);
    }
}