/* TQC+ JAVA6 - 401 */

import java.util.Scanner;

public class JPA401 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        //�@�}�l����J�@�ӼƦr
        System.out.print("Input n (0<=n<=16):");
        int i = keyboard.nextInt();

        //�u�n�����󵲧��ݭn��999�K�i�i�J�j��
        while(i!=999){
        	//�i�J�j���A���ˬd�O�_���b0~16���d��
        	if(i<=16&&i>=0)
        	   System.out.println(i+"������ = "+R(i));
        	//��ܧ���A�A�ШϥΪ̿�J�@�ӼƦr
        	System.out.print("Input n (0<=n<=16):");
        	i = keyboard.nextInt();
        }
    }

    //���j�p���k
    static int R(int i ){
    	if(i==0)//��ǤJ���s�ɡA�h�^��1
    		return 1;
    	else //�C���ҷ|���W�ۤv����k�A�åB�ǤJi-1���ȶi�J
    		return  i*R(i-1);
    }
}
