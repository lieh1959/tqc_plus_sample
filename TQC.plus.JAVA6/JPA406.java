/* TQC+ JAVA6 - 406 */

import java.util.Scanner;

public class JPA406 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        String s;
        System.out.print("Input a String :");
    	s = keyboard.nextLine();
    	System.out.println(s + " has " + countA(s) + " As");
        System.out.print("Input a String :");
        s = keyboard.nextLine();
        System.out.println(s + " has " + countA(s) + " As");
    }
    //���I�b���p��A�Ӽƪ���k
    public static int countA(String str) {
        //��ǤJ���r�ꬰ�Ŧr��ɡA�^��A���ƥt��0
        if(str.equals(""))
    	   return 0;
        //�^���r�ꪺ�Ĥ@�Ӧr���A�p�G��A�A�h�[1�A�åB�Q��substringŪ�X��m1���᪺�Ҧ��r��A�ǤJcountA
        if(str.substring(0,1).equals("A"))
            return 1+countA(str.substring(1));
        //�p�G�Ĥ@�Ӧr�ꤣ����A�A�����Q��substringŪ�X��m1���᪺�Ҧ��r��ǤJcountA
        else
    	   return countA(str.substring(1));

    }
}