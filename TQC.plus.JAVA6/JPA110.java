public class JPA110 {
    public static void main(String args[]) {
        double totalarea;
        System.out.printf("��έ��n���G%f \n",calCircle(5));
        System.out.printf("�T���έ��n���G%f \n",calTriangle(10,5));
        System.out.printf("��έ��n���G%f \n",calRectangle(10,5));
        totalarea = calCircle(5) + calTriangle(10,5) + calRectangle(10,5) ;
        System.out.printf("���ϧέ��n���G%f \n",totalarea);
    }
    //�ŧi�@�ӭp��ꭱ�n����k
    public static double calCircle(int a) {
    	return (a*a*3.1415926);    
    }
    //�ŧi�@�ӭp��T���έ��n����k
    public static double calTriangle(int a,int b) {
    	//�O�o�n�Na*b�����n�j���૬��double�A�o�˰��X�ӼƦr�~�|�O�d�p�Ƴ���
    	return ((double)(a*b)/2);
    }
    //�ŧi�@�ӭp�����έ��n����k
    public static int calRectangle(int a,int b) {
    	return (a*b);
    }
}
