/* TQC+ JAVA6 - 105 */

import java.util.Scanner;

public class JPA105 {
    public static void main (String[] args) {
        System.out.print("Ոݔ����������:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.printf("Hi, %s,Ոݔ�������~��Ă���:\n",name);
        System.out.print("Ոݔ��1Ԫ�Ĕ���:");
        int n1 = sc.nextInt();
        System.out.print("Ոݔ��5Ԫ�Ĕ���:");
        int n5 = sc.nextInt();
        System.out.print("Ոݔ��10Ԫ�Ĕ���:");
        int n10 = sc.nextInt();
        System.out.print("Ոݔ��50Ԫ�Ĕ���:");
        int n50 = sc.nextInt();

        int sum,G1,G2,G3,G4;

        sum = n1*1 + n5*5 + n50*50 +n10*10;
        //�������~����1000��С���cǰ��Hʣǧλ���@�������K�ɸ��c����������������С���c�ԕ���ʧ
        G1 =  sum/1000;
        //�������~����100��С���cǰ��Hʣǧλ���Ͱ�λ���@�ɔ������M��mod�\�㣬����10���N�Ĕ����@�ӱ�H�����ڰ�λ��
        G2 = (sum/100)%10;
        //�������~����10��С���cǰ��Hʣǧλ���Ͱ�λ����ʮλ���@���������M��mod�\�㣬����10���N�Ĕ����@�ӱ�H������ʮλ��
        G3 = (sum/10)%10;
        //�������~�M��mod�\�㣬����10���N�Ĕ����@�ӱ�H�����ڂ�λ��
        G4 = sum%10;
        System.out.printf("�����X������: %d ǧ %d �� %d ʮ %d Ԫ",G1,G2,G3,G4);
    }
}



