import java.util.*;
public class JPA306 {
    public static void main (String argv[]){
        int num1, num2;
  
        Scanner input = new Scanner(System.in);
        //���b�j��~���ШϥΪ̿�J�Ĥ@�ӼƦr
        System.out.println("Input:"); 
        num1 = input.nextInt();
        //�ˬd�Ĥ@�ӼƦr�O�_�ŦX����
        while (num1 != 999) {
        	//�A�ШϥΪ̿�J�ĤG�ӼƦr
            num2 = input.nextInt();
            System.out.println(powerOf(num1, num2));
            //����A�ШϥΪ̱q�Y��J�Ĥ@�ӼƦr
            System.out.println("Input:"); 
            num1 = input.nextInt();    
        }
    }  
    //N����B���k  
    static int powerOf (int m, int n) {
        //�]Math.pow()���^�ǭȬ�doubel�A�G���G�����N���j���૬��int
    	return (int) (Math.pow(m,n));
    }
}
