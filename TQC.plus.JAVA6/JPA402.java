import java.util.Scanner;
public class JPA402 {
    public static void main(String[] args) {
    	 int size = 0;
    	 
         do{
    	 System.out.print("Input n ( 0 <= n <= 16 ):");
         size = new Scanner(System.in).nextInt();
         }while(size>16&&size!=999||size<0&&size!=999);

         while(size!=999)
         {
        	//�j���k
        	int L = facLoop(size);
        	System.out.printf("%d������(�j��) = %d\n",size,L);
         	//���ݻ��j
        	int T = facTail(size,1);
         	System.out.printf("%d������(�����j) = %d\n",size,T);
         	
         	do{
           	 System.out.print("Input n ( 0 <= n <= 16 ):");
                size = new Scanner(System.in).nextInt();
                }while(size>16&&size!=999||size<0&&size!=999);
         }
    }
    //�j���k:�ϥ�for-loop
    public static int facLoop(int a)
    {
    	int sum = 1;
    	for(int b=1;b<=a;b++)
    		sum = b*sum;
    	return sum;	
    }
    //���ݻ��j:���_�I�s�ۤv����k�A�i��B��
    public static int facTail(int a,int b)
    {
    	if(a==1)
    		return b;
    	else
    		return facTail(a-1,a*b);	
    }
}