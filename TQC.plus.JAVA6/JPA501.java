/* TQC+ JAVA6 - 501 */

import java.util.Scanner;

public class JPA501 {
    public static void main(String[] args) {
        int[] n = new int[10];
        Scanner sc = new Scanner(System.in);
        int count=0,sum=0;
        System.out.println("�п�J10�Ӿ��:");
        //�ϥΰj��p��}�C
        for(int a=0;a<10;a++) {
        	System.out.print("��"+(a+1)+"�Ӿ��:");
        	//a�ܼƥѰj��ӱ���
        	n[a]=sc.nextInt();
        	//�P�_���A�p�G�j��60�A�h�N���ƥ[�Jsum
        	if(n[a]>60) {
        		count++;
        	    sum+=n[a];
        	}
        }
        System.out.printf("�}�C���j��60����%d��\n", count);
        System.out.printf("�`�X��%d\n", sum);
        System.out.printf("�����Ȭ�%f\n", (double)sum/count);
    }
}
