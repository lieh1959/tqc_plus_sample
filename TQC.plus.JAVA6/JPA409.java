/* TQC+ JAVA6 - 409 */

import java.util.Scanner;
public class JPA409 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        String s, c;
        System.out.print("Input a string: ");
        s = keyboard.nextLine();
        System.out.print("Input a character: ");
        c = keyboard.nextLine();
        System.out.printf("%s\n", removeChar(s, c));
        System.out.print("Input a string: ");
        s = keyboard.nextLine();
        System.out.print("Input a character: ");
        c = keyboard.nextLine();
        System.out.printf("%s\n", removeChar(s, c));
    }

    static String removeChar(String s,String c)
    {
    	if(s.equals(""))//�p�G�ǤJ���r�ꬰ�Ū��ܡA�h�^�ǪŦr��
    		return "";
    	if(s.substring(0, 1).equals(c))//�p�G�ǤJ�r�ꪺ�Ĥ@�Ӧr������n�R�����r��
    	                               //�h�Q��substringŪ����m1���᪺�Ҧ��r��æA���ǤJremoveChar
    		return removeChar(s.substring(1),c);
    	else//�p�G������n�R�����r���A�h�ɦ^�ܭ쥻���r�ꤤ
    		return s.substring(0, 1)+removeChar(s.substring(1),c);
    }
}