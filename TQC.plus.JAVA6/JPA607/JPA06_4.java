/* TQC+ JAVA6 - 607_4 */

public class JPA06_4 {
    public static void main(String[] arge){
        String[] map = { "�_��" , "����" , "�n��" };
        int[][] salary = {
            { 120, 420, 315, 250, 418, 818, 900 },
            { 312, 183, 215, 89, 83, 600, 700 },
            { 215, 500, 430, 210, 300, 918, 880 }
        };
        int cost[] = {180, 200, 360};
        int cost1[] = {1500, 1515, 1858};
        int sum[] = {0, 0, 0};
        double data[] = {0, 0, 0};
        int i , j , i_max=3;
        double ratio;

        //�z�L��h��for loop�p��X�U�����`��~�B
        for(int b=0;b<salary.length;b++){
            for(int a=0;a<salary[b].length;a++){
                sum[b]+=salary[b][a];
            }
        }

        //�p��C�a����Q�v
        for(int a = 0;a<data.length;a++){
            data[a]=((sum[a]-cost[a]-cost1[a])/(double)(cost[a]+cost1[a])*100);
        }

        //��ܥX���
        for( i = 0 ; i <  i_max ; i++ ){
            System.out.print("��"+(i+1)+"�����穱�P���`����="+(cost[i]+cost1[i])+"\n");
            System.out.print("�P���`��~�B="+sum[i]+"\n");
            ratio = data[i];
            System.out.printf("�P��P���Q=%.2f",ratio);
            System.out.print("%\n");
            System.out.println();
        }
    }
}
