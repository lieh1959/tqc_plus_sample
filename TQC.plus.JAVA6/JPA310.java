/* TQC+ JAVA6 - 310 */

//���D�D�حn�D�ϥ�do-while-loop
import java.util.Scanner;

public class JPA310 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int init = 2,sum=0;
        int size = 0;
        //�����ϥΪ̿�Jn��
        System.out.println("�п�Jn����(n>0�A�B������)�G");
    	size = new Scanner(System.in).nextInt();
    	//�ˬdn�ȬO�_�j��s�B�����ơA�Y���ŦX�K�@�A���s�n�D��J
    	while(size<=0||size%2!=0) {
            System.out.print("�п�Jn����(n>0�A�B������)�G");
        	size = new Scanner(System.in).nextInt();
    	}
        //�}�l�i��֥[�ʧ@
    	do{
         	sum = init +sum;
        	init += 2;
        }while(init<=size);//��֥[�Ϊ��ܼƤj��ϥΪ̿�J���ȫK����
        System.out.printf("%d+%d+...+%d=%d", 2,4,size,sum);
    }
}