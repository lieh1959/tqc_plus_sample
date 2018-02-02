import java.util.*;
class JPA204 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
    }
  
    public static void test() {
    	System.out.println("Input:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //使用and的運算，並且同時符合mod5=0和mod9=0的數字，使得if的判斷式成立
        if((a%5)==0 && (a%9)==0)
        	System.out.printf("Yes\n");
        else 
        	System.out.printf("No\n");
        }
}

