/* TQC+ JAVA6 - 308 */

//���D�n�D�ϥ�do-while-loop
import java.util.Scanner;

public class JPA308 {
    static Scanner keyboard = new Scanner(System.in);
    static int i = -1;

    public static void main(String[] args) {
        int total = 0, s = 0;
        //do-while-loop���S�ʬO���|���ˬd����A�@�w�|���j�����@��
        do {
        	System.out.print("�п�J���O���B�A�ο�J-1����:");
        	total = total +s;
        	//�]�ڭ̬O�z�L�ϥΪ̿�J-1�ӧP�_�����A�ҥH-1���ƭȤ��i�[�J�B��A�G�N���\�b���Y�A�ϥL�L�@�ή�
        	//�|�����Q����O�ױ��Ӹ����j��
        	s = new Scanner(System.in).nextInt();
        } while(s!=-1);
        System.out.print("�q���P���`���O:" + total);
    }
}