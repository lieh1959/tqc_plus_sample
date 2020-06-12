/* TQC+ JAVA6 - 503 */

public class JPA503 {
    final static int ROW = 2;
    final static int COL = 3;
    public static void main(String args[]) {
        int A[][] = {{1,2,3}, {4,5,6}};
        int B[][] = {{7,8,9}, {10,11,12}};
        int C[][] = new int[ROW][COL];
        System.out.printf("陣列A的內容為(3x3)：\n");
        show(A);
        System.out.printf("\n陣列B的內容為(3x3)：\n");
        show(B);
        add(A, B, C);
        System.out.printf("\n陣列A+B=C，陣列C的內容為(3x3)：\n");
        show(C);
    }
    //相加陣列的方法
    public static void add(int[][] A,int[][] B,int[][] C){
    //第一個變數和第二個變數為導入方法用，第三個變數則是用來儲存相加後的陣列
    	for(int b=0;b<2;b++) {
            for(int a=0;a<3;a++)
    	       C[b][a]=A[b][a]+B[b][a];
        }
    }
    //陣列顯示方法，透過兩層的for-loop可以將它print出來
    public static void show(int[][] s) {
        for(int b=0;b<2;b++){
            for(int a=0;a<3;a++)
                System.out.printf("%02d ",s[b][a]);
            System.out.println("");
        }
    }
}