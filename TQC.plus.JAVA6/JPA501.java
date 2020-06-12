/* TQC+ JAVA6 - 501 */

import java.util.Scanner;

public class JPA501 {
    public static void main(String[] args) {
        int[] n = new int[10];
        Scanner sc = new Scanner(System.in);
        int count=0,sum=0;
        System.out.println("請輸入10個整數:");
        //使用迴圈計算陣列
        for(int a=0;a<10;a++) {
        	System.out.print("第"+(a+1)+"個整數:");
        	//a變數由迴圈來控制
        	n[a]=sc.nextInt();
        	//判斷式，如果大於60，則將此數加入sum
        	if(n[a]>60) {
        		count++;
        	    sum+=n[a];
        	}
        }
        System.out.printf("陣列中大於60的有%d個\n", count);
        System.out.printf("總合為%d\n", sum);
        System.out.printf("平均值為%f\n", (double)sum/count);
    }
}
