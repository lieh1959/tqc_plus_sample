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
    //重點在此計算A個數的方法
    public static int countA(String str) {
        //當傳入的字串為空字串時，回傳A的數另為0
        if(str.equals(""))
    	   return 0;
        //擷取字串的第一個字元，如果為A，則加1，並且利用substring讀出位置1之後的所有字串再傳入countA
        if(str.substring(0,1).equals("A"))
            return 1+countA(str.substring(1));
        //如果第一個字串不等於A，直接利用substring讀出位置1之後的所有字串傳入countA
        else
    	   return countA(str.substring(1));

    }
}