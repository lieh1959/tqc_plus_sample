/* TQC+ JAVA6 - 304 */

import java.util.Scanner;

public class JPA304 {
    public static void main(String[] args) {
        int total = 0;
        int s = 0;
        int count =0;
        double average;
        //���b�j��~���n�D�ϥγo��J
        System.out.print("Please enter meal dollars or enter -1 to stop: ");
        s = new Scanner(System.in).nextInt();
        //�i�J�j��ɷ|�ˬd�A�ϧ_�ŦX����
        while(s!=-1){
            //�i�J�j���A�Ĥ@��ƫK�O�i��B��
            count++;
            total = total +s;
            //�B�⧹��A���n�D�ϥΪ̿�J
            System.out.print("Please enter meal dollars or enter -1 to stop: ");
            s = new Scanner(System.in).nextInt();
        }
        average = (double)total/count;
        System.out.println("�\�I�`�O��:" + total);
        System.out.printf(" %d �D�\�I�����O�ά�: %.2f %n",count,average);
    }
}