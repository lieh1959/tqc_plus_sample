/* TQC+ JAVA6 - 401 */

import java.util.Scanner;

public class JPA401 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        //一開始先輸入一個數字
        System.out.print("Input n (0<=n<=16):");
        int i = keyboard.nextInt();

        //只要不等於結束需要的999便可進入迴圈
        while(i!=999){
        	//進入迴圈後再次檢查是否有在0~16的範圍中
        	if(i<=16&&i>=0)
        	   System.out.println(i+"的階乘 = "+R(i));
        	//顯示完後，再請使用者輸入一個數字
        	System.out.print("Input n (0<=n<=16):");
        	i = keyboard.nextInt();
        }
    }

    //遞迴計算方法
    static int R(int i ){
    	if(i==0)//當傳入為零時，則回傳1
    		return 1;
    	else //每次皆會乘上自己的方法，並且傳入i-1的值進入
    		return  i*R(i-1);
    }
}
