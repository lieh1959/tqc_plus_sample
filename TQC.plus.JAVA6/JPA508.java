/* TQC+ JAVA6 - 508 */

//��������
public class JPA508 {
    public static void main(String[] args){
        int data[] = {2,4,3,5,7,6,9,1};//δ�����Y��
        //��ȡ������L��
        int LN = data.length-1;

        for(int i=0;i<LN;i++){
            for(int j = 0;j<LN;j++){
                //���������λ����С�ǰ���ǔ��քt���Q
                if(data[j]>data[j+1]){
                    int temp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = temp;
                }
            }
            //ÿ����һ�����򣬱��@ʾ���Y��
            for(int x=0;x<=LN;x++)
                System.out.print(data[x]+" ");
            System.out.println("");
        }
    }
}
