/* TQC+ JAVA6 - 410 */

import java.util.Scanner;
public class JPA410 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        String s, c1, c2;
        System.out.print("Input a string: ");
        s = keyboard.nextLine();
        System.out.print("Input a character: ");
        c1 = keyboard.nextLine();
        System.out.print("Input another character: ");
        c2 = keyboard.nextLine();
        System.out.printf("%s\n", replace(s, c1, c2));
    }

    static String replace(String s,String c1,String c2){
    	if(s.equals(""))//�p�G�ǤJ���r�ꬰ�Ū��ܡA�h�^�ǪŦr��
    		return "";
    	if(s.substring(0, 1).equals(c1))//�p�GŪ�X���r������n���N���r���A�h�N�s���r���[�W�h
    		return c2+replace(s.substring(1),c1,c2);
    	else//�p�G�����󪺸ܡA�ɦ^�ܭ쥻���r��
    		return s.substring(0, 1)+replace(s.substring(1),c1,c2);
    }
}