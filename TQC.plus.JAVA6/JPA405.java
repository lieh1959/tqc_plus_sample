import java.util.Scanner;
public class JPA405 {
	static int sum = 0;
    public static void main(String[] args) {
         System.out.print("Input the number :");
         int m = new Scanner(System.in).nextInt();
         int ans =sum2(m);
         System.out.printf("Ans:%d",ans);
    }
    //sum2��k�A�����D�ص������ܡA�N�{���N�J�Y�i
    public static int sum2(int m)
    {
    	    if(m==1)
    	    	return 2;
    	    else
            {
    	    //���������ݻ��j������
            sum = sum + sum2(m-1)+2*m;
            return sum;
            }
    }
}