/* TQC+ JAVA6 - 509 */

//��ܱƧǪk
public class JPA509{
    static int t = 0;
    public static void main(String[] argv) {
        int[] data = {1, 3, 2, 5, 4, 6};
            sort(data);
    }

    //�]�p�@�ӿ�ܱƧǪk��k
    public static void sort(int[] d){
        //�����o���סA������Ƭ��ƶq-1
        int LN = d.length-1;
        int i,j,min;

        for(i = 0 ; i < LN ; i++){
            //���N�@�}�l����m�g�J
            min=i;
            for(j=(i+1);j<=LN;j++)
                if(d[j]<d[min])//�p�G�����񥦧�p���A�h�N�̤p���g�Jmin
                    min=j;

            int temp = d[i];
            d[i] = d[min];
            d[min]=temp;

            for(int k=0;k<=LN;k++)
                System.out.print(d[k]+" ");
            System.out.println();
        }
    }
}
