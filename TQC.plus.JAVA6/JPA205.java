import java.util.*;
public class JPA205 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        test();
        test();
    }
    //�g�@�Ӥ�k�Ӱ��歿�ƧP�_
    static void test() {
    	System.out.println("Enter an integer:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //���P�_�O�_�O6�����ơA�ѳ̤j���ƶ}�l�P�_
        if ((a%6)==0)
        	System.out.printf("%d�O2�B3�B6������\n",a);
        //�p�G���O6�����ơA�A�P�_�O�_��2��3�����ơA�䤤�P�_2��3�����ǨS���t
        else if ((a%2)==0)
        	System.out.printf("%d�O2������\n",a);
        else if ((a%3)==0)
        	System.out.printf("%d�O3������\n",a);	
        else
        	System.out.printf("%d���O2�B3�B6������\n",a);
    }
}
