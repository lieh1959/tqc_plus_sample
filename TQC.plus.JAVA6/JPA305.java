import java.util.Scanner;
public class JPA305 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        test();
    }
    
    public static void test() {
    	System.out.print("Please enter one value:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum=1;
        //條件判斷，是否在使用者輸入值1~10之間
        if(a>0&&a<=10)
        {	
        	//進行階乘運算
        	for(int t=1 ; t<=a ; t++)
        		sum = sum*t;
        		        		
        	System.out.printf("%d! : %d\n",a,sum);
        }
        else 
        	System.out.printf("Error, the value is out of range.");
    }
}