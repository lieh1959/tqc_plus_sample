/* TQC+ JAVA6 - 402 */

import java.util.Scanner;
public class JPA402 {
    public static void main(String[] args) {
        int size = 0;

        do{
            System.out.print("Input n ( 0 <= n <= 16 ):");
            size = new Scanner(System.in).nextInt();
        }while(size>16&&size!=999||size<0&&size!=999);

        while(size!=999){
            //迴圈方法
            int L = facLoop(size);
            System.out.printf("%d的階乘(迴圈) = %d\n",size,L);
            //尾端遞迴
            int T = facTail(size,1);
            System.out.printf("%d的階乘(尾遞迴) = %d\n",size,T);

            do{
                System.out.print("Input n ( 0 <= n <= 16 ):");
                size = new Scanner(System.in).nextInt();
            }while(size>16&&size!=999||size<0&&size!=999);
         }
    }

    //迴圈方法:使用for-loop
    public static int facLoop(int a){
        int sum = 1;

        for(int b=1;b<=a;b++)
            sum = b*sum;

        return sum;
    }

    //尾端遞迴:不斷呼叫自己的方法，進行運算
    public static int facTail(int a,int b){
        if(a==1)
            return b;
        else
            return facTail(a-1,a*b);
    }
}
