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
    	if(s.equals(""))//如果傳入的字串為空的話，則回傳空字串
    		return "";
    	if(s.substring(0, 1).equals(c))//如果傳入字串的第一個字元等於要刪除的字元
    	                               //則利用substring讀取位置1之後的所有字串並再次傳入removeChar
    		return removeChar(s.substring(1),c);
    	else//如果不等於要刪除的字元，則補回至原本的字串中
    		return s.substring(0, 1)+removeChar(s.substring(1),c);
    }
}