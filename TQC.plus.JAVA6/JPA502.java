import java.util.Scanner;
public class JPA502 {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.print("�п�J�ǥͤH�ơG");
        Scanner sc = new Scanner(System.in);
        int poe = sc.nextInt();
        float sum = 0;
        float[] ps = new float[poe];
        //�j�馸�ƨM�w�i��J�X�Ӿǥͦ��Z�A�Ӱj�馸�ƥѨϥΪ̿�J
        for(int a =0;a<poe;a++)
        {
        	System.out.print("��"+(a+1)+"�Ӿǥͪ����Z:");
        	ps[a]=sc.nextFloat();
        	sum +=ps[a];
        }
        System.out.println("�H��:"+poe);
        System.out.println("�`��:"+sum);
        System.out.println("����:"+sum/poe);
    }
}