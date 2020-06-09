/* TQC+ JAVA6 - 205 */

import java.util.*;

public class JPA205 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        test();
        test();
    }
    //寫一個方法來執行倍數判斷

    static void test() {
        System.out.println("Enter an integer:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        //先判斷是否是6的倍數，由最大的數開始判斷
        if ((a%6)==0)
            System.out.printf("%d是2、3、6的倍數\n",a);
        //如果不是6的倍數，再判斷是否為2或3的倍數，其中判斷2或3的順序沒有差
        else if ((a%2)==0)
            System.out.printf("%d是2的倍數\n",a);
        else if ((a%3)==0)
            System.out.printf("%d是3的倍數\n",a);
        else
            System.out.printf("%d不是2、3、6的倍數\n",a);
   }
}
