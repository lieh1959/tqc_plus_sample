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
        //�ϥ�and���B��A�åB�P�ɲŦXmod5=0�Mmod9=0���Ʀr�A�ϱoif���P�_������
        if((a%5)==0 && (a%9)==0)
        	System.out.printf("Yes\n");
        else 
        	System.out.printf("No\n");
        }
}

