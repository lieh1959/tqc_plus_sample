//��ܱƧǪk
public class JPA509{
    static int t = 0;
	public static void main(String[] argv) {
        int[] data = {1, 3, 2, 5, 4, 6};
        int[] show = new int[data.length];
        //�`�@�n���������
        for(int a=0;a<data.length-1;a++)
        	  {
        	   show=sort(data);
        	   System.out.println("");
        	  }
    }
    public static int[] sort(int[] d)
    {
    	int temp =0;
    	//���N�C���n�������lindex�g�J�@���ܼơA�M��@��������index�p��}�C����
		for(int c=t;c<d.length;c++)
		{
			if(d[t]>d[c])
			{
				temp=d[t];
				d[t]=d[c];
				d[c]=temp;
			}		
		}
		//�Nt��+1�A���U�@�Ӱj��n�������lindex�Ჾ�@��
		t++;
		for(int b=0;b<d.length;b++)
 		   System.out.print(d[b]+" ");
			return d;
    }
}