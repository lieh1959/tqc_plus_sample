public class JPA504 {
    public static void main(String[] args) {
        int[] n = new int[10];
        //��l�ƫe��Ӽ�
        n[0]=0;
        n[1]=1;
        //�O���ƦC�e�Q��
        for(int a=2;a<10;a++)
        	n[a]=n[a-1]+n[a-2];//�}�C��index��2�}�l�A��ت��b��ۥ[�e�����index=1 and 0
        for(int a=0;a<10;a++)
        	System.out.println(n[a]);
    }
}