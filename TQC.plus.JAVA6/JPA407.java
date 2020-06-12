/* TQC+ JAVA6 - 407 */

import java.util.Scanner;

public class JPA407 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        String s;
        System.out.print("Input a string of numbers: ");
        s = keyboard.nextLine();
        System.out.printf("���ݻ��j�G%d\n", sumTail(s, 0));
        System.out.printf("�j��G%d\n", sumLoop(s));
        System.out.print("Input a string of numbers: ");
        s = keyboard.nextLine();
        System.out.printf("���ݻ��j�G%d\n", sumTail(s, 0));
        System.out.printf("�j��G%d\n", sumLoop(s));
    }
    //�j���k
    static int sumLoop(String s) {
	   int ln = s.length();
	   int[] num = new int[ln];

       for(int i=0;i<ln;i++)
		   num[i]=Integer.parseInt(s.substring(i, i+1));
	   int sum =0;
	   for(int i=0;i<ln;i++)
		   sum+=num[i];
	   return sum;
    }

    //���ݻ��j
    static int sumTail(String s,int i){
	   if(s.equals(""))//�p�G�ǤJ���r�ꬰ�šA�^�ǲ֥[��i��
		   return i;
	   else//�r�ꤣ���ŮɡA�h�Q��substringŪ����m1���᪺�r��A�öǤJ
		   //�᭱��i�ȫh�N�r�ꪺ�Ĥ@�Ӧr��Ū�X�ন�Ʀr�ò֥[
	       return sumTail(s.substring(1),i+Integer.parseInt(s.substring(0, 1)));
   }
}