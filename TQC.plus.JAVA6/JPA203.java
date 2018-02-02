import java.util.*;
public class JPA203 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
    }
    
    static void test() {
    	System.out.println("Input:");
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        //要判斷奇偶數，便可用mod2的運算，如果整除2，則mod2=0，視為偶數；反之，mod2=1，沒有整除2，而為奇數
        if((a%2)==0)
        	System.out.printf("The number is even.\n");
        else if((a%2)==1)
        	System.out.printf("The number is odd.\n");
        else
        	System.out.printf("Error!!");
        
    }
}
