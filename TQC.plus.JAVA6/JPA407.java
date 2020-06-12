/* TQC+ JAVA6 - 407 */

import java.util.Scanner;

public class JPA407 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        String s;
        System.out.print("Input a string of numbers: ");
        s = keyboard.nextLine();
        System.out.printf("尾端遞迴：%d\n", sumTail(s, 0));
        System.out.printf("迴圈：%d\n", sumLoop(s));
        System.out.print("Input a string of numbers: ");
        s = keyboard.nextLine();
        System.out.printf("尾端遞迴：%d\n", sumTail(s, 0));
        System.out.printf("迴圈：%d\n", sumLoop(s));
    }
    //迴圈方法
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

    //尾端遞迴
    static int sumTail(String s,int i){
	   if(s.equals(""))//如果傳入的字串為空，回傳累加的i值
		   return i;
	   else//字串不為空時，則利用substring讀取位置1之後的字串，並傳入
		   //後面的i值則將字串的第一個字元讀出轉成數字並累加
	       return sumTail(s.substring(1),i+Integer.parseInt(s.substring(0, 1)));
   }
}