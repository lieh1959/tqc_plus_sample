//�w�w�ƧǪk 
public class JPA508 {
    public static void main(String[] argv) {
        int[] data = {2, 4, 3, 5, 7, 6, 9, 1};  // ���ƧǪ���� 8��
        int size = data.length;
        //�`�@�|���7��
        for(int c=0;c<7;c++)
        {
        //�C����������ơA�p��}�C�̤j��index��
        for(int a=0;a<(size-1);a++)
        {
        	//�p�G�᭱���Ƥp��e�����ơA�h�i��洫
        	if(data[a+1]<data[a]) 
        	{
        	int temp = 0;
        	temp=data[a+1];
        	data[a+1]=data[a];
        	data[a]=temp;
        	}
        }   
        for(int b=0;b<size;b++)
        	System.out.print(" "+data[b]);
        System.out.println("");
        }
    }
}