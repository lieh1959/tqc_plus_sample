public class JPA303 {
    public static void main(String[] args) {
        int i, j, sum = 0;
        System.out.printf("1~1000���������Ʀ�: ");
        
        for (j=2;j<1000;j++){//�Ĥ@�h�j��q2�]��1000
            sum=0;
            for (i=1;i<j;i++) //�ĤG�h�j��q1�]��Ĥ@�h�j�骺�Ʀr�K����
                if(j%i==0)//�b�䤤�A�Y����Ƭ۬�j���]�ơA�h�N���[�J�`�M��
                	sum = sum + i;
         //�Y�̫᪺�`�X���󥻨��ӼơA�h�L�X�ȹ���
         if(sum==j) 
            System.out.printf("%d ",j); 
        }
    }
}