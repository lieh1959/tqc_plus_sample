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
        //�n�P�_�_���ơA�K�i��mod2���B��A�p�G�㰣2�A�hmod2=0�A�������ơF�Ϥ��Amod2=1�A�S���㰣2�A�Ӭ��_��
        if((a%2)==0)
        	System.out.printf("The number is even.\n");
        else if((a%2)==1)
        	System.out.printf("The number is odd.\n");
        else
        	System.out.printf("Error!!");
        
    }
}
