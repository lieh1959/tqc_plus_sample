import java.util.Scanner;
public class JPA307 {
    public static void main (String argv[]){
        int num1, num2;
        //�����ϥΪ̦b�j��~����J��ӼƦr
        System.out.println("Input:"); 
        num1 = new Scanner(System.in).nextInt();
    	num2 = new Scanner(System.in).nextInt();
        //�Y���󤣲ŦX�K���|�i�J�j��
    	while (num1!=999) {
        	//�@�i�|�j���A�|������@��gcd��k
    		System.out.println(gcd(num1,num2));
        	//�ϥΪ̦A����J��ӼƦr�A�ѤU���j��P�_
    		System.out.println("Input:");
        	num1 = new Scanner(System.in).nextInt();
        	num2 = new Scanner(System.in).nextInt();
        }
    }  
  //gcd�D�̤j���]�ƺt��k
    static int gcd (int m, int n) {
           	 int tmp;
             while (m % n != 0) {
                 tmp = n;
                 n = m % n;
                 m = tmp;
             }
             return n;  
    }
}