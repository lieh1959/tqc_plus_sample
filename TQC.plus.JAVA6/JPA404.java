/* TQC+ JAVA6 - 404 */

import java.util.Scanner;

public class JPA404 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
    	//���ШϥΪ̿�Jm��
    	System.out.print("Input m :");
    	int m = keyboard.nextInt();
    	//�j��P�_�Am�n������999�~�i�i�J
            while(m!=999){
    	        //�i�J�j���A�ШϥΪ̿�Jn��
    	        System.out.print("Input n :");
    	        int n = keyboard.nextInt();
    	        //�i��̤j���]�ƭp��
    	        System.out.println(R(m,n));
    	        //�j��̫�b�n�D�ϥΪ̿�J�U�@�Ӱj��ݭn��m�A�Y��m�b�i�J�U�@�Ӱj��ɱ��󤣹L�A�h���i�J�j��F
    	        System.out.print("Input m :");
    	        m = keyboard.nextInt();
            }

    }

    //gcd�D�̤j���]�ƺt��k
    static int R(int m,int n){
    	if(m%n==0)//�p�Gmod���s�ɡA�h���̤j���]�ơA�^�ǭ�
    		return n;
    	else {//�p�Gmod�Ƥ����s�ɡA�h��mod�o�쪺�Ƽg�Jm�A�A���i��gcd
    		int tem = n;
    		n = m%n;
    		m = tem;
    		return R(m,n);
    	}
    }
}
