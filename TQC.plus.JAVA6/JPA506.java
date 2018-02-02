public class JPA506 {
    public static void main(String[] argv) {
       int sum =0;
       //觀察此三維陣列是由四維包二維再包三維的
       int A[][][] = {{{1,2,3},{4,5,6}},
                       {{7,8,9},{10,11,12}},
                       {{13,14,15},{16,17,18}},
                       {{19,20,21},{22,23,24}}};
       //透過三個for-loop迴圈來相加
       for(int a=0;a<4;a++)
           for(int b=0;b<2;b++)
               for(int c=0;c<3;c++)
                   sum+=A[a][b][c]; 			
       System.out.printf("sum = %d\n", sum);
    }
}