import java.util.*;
public class JPA306 {
    public static void main (String argv[]){
        int num1, num2;
  
        Scanner input = new Scanner(System.in);
        //先在迴圈外面請使用者輸入第一個數字
        System.out.println("Input:"); 
        num1 = input.nextInt();
        //檢查第一個數字是否符合條件
        while (num1 != 999) {
        	//再請使用者輸入第二個數字
            num2 = input.nextInt();
            System.out.println(powerOf(num1, num2));
            //之後再請使用者從頭輸入第一個數字
            System.out.println("Input:"); 
            num1 = input.nextInt();    
        }
    }  
    //N次方運算方法  
    static int powerOf (int m, int n) {
        //因Math.pow()的回傳值為doubel，故結果必須將它強制轉型為int
    	return (int) (Math.pow(m,n));
    }
}
