/* TQC+ JAVA6 - 301 */

import java.util.*;

class JPA301 {
    public static void main(String argv[]) {
        System.out.println("Input:");
        int tm =new Scanner(System.in).nextInt();
        int sum = 0 ;
        //�q1�}�l�[�A�B�ܼƷ|�@��+1�A�[�J�`�M�A�����ܼƤj��ϥΪ̿�J���ƫK����
        for (int a=1;a<=tm ; a++) {
            sum = sum+a;
        }
        System.out.printf("1 + ... + %d = %d",tm,sum);
    }
}