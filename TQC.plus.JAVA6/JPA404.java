/* TQC+ JAVA6 - 404 */

import java.util.Scanner;

public class JPA404 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
    	//先請使用者輸入m值
    	System.out.print("Input m :");
    	int m = keyboard.nextInt();
    	//迴圈判斷，m要不等於999才可進入
            while(m!=999){
    	        //進入迴圈後再請使用者輸入n值
    	        System.out.print("Input n :");
    	        int n = keyboard.nextInt();
    	        //進行最大公因數計算
    	        System.out.println(R(m,n));
    	        //迴圈最後在要求使用者輸入下一個迴圈需要的m，若此m在進入下一個迴圈時條件不過，則不進入迴圈了
    	        System.out.print("Input m :");
    	        m = keyboard.nextInt();
            }

    }

    //gcd求最大公因數演算法
    static int R(int m,int n){
    	if(m%n==0)//如果mod為零時，則找到最大公因數，回傳值
    		return n;
    	else {//如果mod數不為零時，則把mod得到的數寫入m，再次進行gcd
    		int tem = n;
    		n = m%n;
    		m = tem;
    		return R(m,n);
    	}
    }
}
