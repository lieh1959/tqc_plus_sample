/* TQC+ JAVA6 - 308 */

//本題要求使用do-while-loop
import java.util.Scanner;

public class JPA308 {
    static Scanner keyboard = new Scanner(System.in);
    static int i = -1;

    public static void main(String[] args) {
        int total = 0, s = 0;
        //do-while-loop的特性是部會先檢查條件，一定會先強行執行一次
        do {
        	System.out.print("請輸入消費金額，或輸入-1結束:");
        	total = total +s;
        	//因我們是透過使用者輸入-1來判斷結束，所以-1此數值不可加入運算，故將它擺在後頭，使他無作用時
        	//會直接被條件是擋掉而跳離迴圈
        	s = new Scanner(System.in).nextInt();
        } while(s!=-1);
        System.out.print("電腦周邊總消費:" + total);
    }
}