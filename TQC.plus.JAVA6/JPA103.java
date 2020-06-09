/* TQC+ JAVA6 - 103 */

import java.util.Scanner;

public class JPA103 {
	public static void main (String[] args) {
		System.out.println("Please input:");
		Scanner sc = new Scanner(System.in);
		//Scanner在讀取的時候會以空白為區隔
		int a,b,c;

		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		//這邊記得要將三個變數之和強制轉型成double，這樣除出來的數字才會是浮點數
		System.out.printf("Average: %4.2f",((double)(a+b+c)/3));
	}
}