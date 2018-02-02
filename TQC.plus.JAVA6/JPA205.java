import java.util.*;
public class JPA205 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        test();
        test();
    }
    //糶よ猭ㄓ磅︽计耞
    static void test() {
    	System.out.println("Enter an integer:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //耞琌琌6计パ程计秨﹍耞
        if ((a%6)==0)
        	System.out.printf("%d琌236计\n",a);
        //狦ぃ琌6计耞琌2┪3计ㄤい耞2┪3抖⊿Τ畉
        else if ((a%2)==0)
        	System.out.printf("%d琌2计\n",a);
        else if ((a%3)==0)
        	System.out.printf("%d琌3计\n",a);	
        else
        	System.out.printf("%dぃ琌236计\n",a);
    }
}
