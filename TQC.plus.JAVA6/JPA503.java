/* TQC+ JAVA6 - 503 */

public class JPA503 {
    final static int ROW = 2;
    final static int COL = 3;
    public static void main(String args[]) {
        int A[][] = {{1,2,3}, {4,5,6}};
        int B[][] = {{7,8,9}, {10,11,12}};
        int C[][] = new int[ROW][COL];
        System.out.printf("�}�CA�����e��(3x3)�G\n");
        show(A);
        System.out.printf("\n�}�CB�����e��(3x3)�G\n");
        show(B);
        add(A, B, C);
        System.out.printf("\n�}�CA+B=C�A�}�CC�����e��(3x3)�G\n");
        show(C);
    }
    //�ۥ[�}�C����k
    public static void add(int[][] A,int[][] B,int[][] C){
    //�Ĥ@���ܼƩM�ĤG���ܼƬ��ɤJ��k�ΡA�ĤT���ܼƫh�O�Ψ��x�s�ۥ[�᪺�}�C
    	for(int b=0;b<2;b++) {
            for(int a=0;a<3;a++)
    	       C[b][a]=A[b][a]+B[b][a];
        }
    }
    //�}�C��ܤ�k�A�z�L��h��for-loop�i�H�N��print�X��
    public static void show(int[][] s) {
        for(int b=0;b<2;b++){
            for(int a=0;a<3;a++)
                System.out.printf("%02d ",s[b][a]);
            System.out.println("");
        }
    }
}