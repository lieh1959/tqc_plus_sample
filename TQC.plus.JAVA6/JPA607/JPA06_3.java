/* TQC+ JAVA6 - 607_3 */

public class JPA06_3 {
    public static void main(String[] arge){

        int[][] n ={
            {120,420,315,250,418,818,900},
            {312,183,215,89,83,600,700},
            {215,500,430,210,300,918,880}
        };
        String[] nn={"北部","中部","南部"};

        System.out.println("\n\t  第一電腦科技公司週報表 ( 單 位 : 萬 元 ) ");
        System.out.println( "直營店 \t 一 \t 二 \t 三 \t 四 \t 五 \t六 \t 日 \t  ");
        System.out.println( "=====\t====\t====\t====\t====\t====\t====\t====");
        //主要是使用兩層的for loop，第一層主要是顯示區域，第二層顯示總營業額
        for(int a=0;a<3;a++){
            System.out.print(nn[a]+"\t");
            for(int b=0;b<7;b++){
                System.out.print(n[a][b]+"\t");
            }
            System.out.println("");
        }
    }
}
