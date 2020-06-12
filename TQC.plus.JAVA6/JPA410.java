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
    	if(s.equals(""))//如果傳入的字串為空的話，則回傳空字串
    		return "";
    	if(s.substring(0, 1).equals(c1))//如果讀出的字元等於要取代的字元，則將新的字元加上去
    		return c2+replace(s.substring(1),c1,c2);
    	else//如果不等於的話，補回至原本的字串
    		return s.substring(0, 1)+replace(s.substring(1),c1,c2);
    }
}