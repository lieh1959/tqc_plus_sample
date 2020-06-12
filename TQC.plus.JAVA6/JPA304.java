/* TQC+ JAVA6 - 304 */

import java.util.Scanner;

public class JPA304 {
    public static void main(String[] args) {
        int total = 0;
        int s = 0;
        int count =0;
        double average;
        //先在迴圈外面要求使用這輸入
        System.out.print("Please enter meal dollars or enter -1 to stop: ");
        s = new Scanner(System.in).nextInt();
        //進入迴圈時會檢查，使否符合條件
        while(s!=-1){
            //進入迴圈後，第一件事便是進行運算
            count++;
            total = total +s;
            //運算完後再次要求使用者輸入
            System.out.print("Please enter meal dollars or enter -1 to stop: ");
            s = new Scanner(System.in).nextInt();
        }
        average = (double)total/count;
        System.out.println("餐點總費用:" + total);
        System.out.printf(" %d 道餐點平均費用為: %.2f %n",count,average);
    }
}