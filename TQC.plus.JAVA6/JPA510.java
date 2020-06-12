/* TQC+ JAVA6 - 510 */

import java.util.Scanner;
public class JPA510 {
    public static Scanner targetboard = new Scanner(System.in);
    static int time = 0;
    public static void main(String[] argv) {
        search();
        time = 0;
        search();
    }
    //�j�M��k�A�D�n�O�b���ƪ����u�@
    public static void search() {
        int[] data = {5, 9, 13, 15, 17, 19, 25, 30, 45}; // �w�ƧǸ��

        System.out.print("�п�J�n��M����ơG");

        int target = targetboard.nextInt();
        int ans = binary_search(data,target,data.length);
        if(ans==-1)
            System.out.println("�g�L "+time+" �����M��\n"+target+"���b�}�C��");
        else
        	System.out.println("�g�L "+time+" �����M��\n�z�n����Ʀb�}�C������"+ans+"�Ӧ�m");
     }
    //�G���k�j�M��k�A�u���b�j�M���a��
    //�ǤJ�Ȧ��T�ӡA�}�C�A�ؼЭȡA�}�C����
    static int binary_search(int[] data,int target, int max){
        int middle, left, right;
        left = 0; right = max-1; // �]�w�ҩl�j�M�d��: ����ɤΥk���(�k��ɥѳ̤j�ȴ�1�o��)
        while (left <= right){
        	time++;
            middle = (left + right) / 2;// ��X������m
            System.out.printf("�M��϶�: %d(%s)..%d(%s),�����G %d(%s)\n",
        	                                            left,String.valueOf(data[left]),
        		                                        right,String.valueOf(data[right]),
        		                                        middle,String.valueOf(data[middle]));
            if (target == data[middle])
                return middle; // �����, �Ǧ^��줧��m
            // �վ�j�M�d��
            if (target < data[middle]) // �����b��� (�վ�k���)
                right = middle - 1;
            else // ���k�b��� (�վ㥪���)
                left = middle + 1;
            }
            return -1; // �S�����, �Ǧ^ -1
    }
}