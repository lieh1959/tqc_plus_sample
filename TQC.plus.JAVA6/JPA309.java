import java.util.Scanner;
class JPA309 {
    public static void main(String argv[]){
        int size = new Scanner(System.in).nextInt();
        int sum = 0;
        //�֥[���j��
        for(int a=1 ;a<=size;a++)
        {
        	//����P�_�A��a�㰣3�Ϊ̾㰣5�A�h�i�J�B�z
        	if(a%3==0 ||a%5==0)
        	{
        		//��b���P�_���A�ŦXa�㰣7���Ʀr�A�h���������Ӧ��j��H�U���Ҧ��{���X�A�q�U�@�Ӱj��}�l
        		if(a%7==0)
        			continue;
        		sum = sum +a;
        	}
        }
                
        System.out.println("Answer: " + sum);
    }
}
