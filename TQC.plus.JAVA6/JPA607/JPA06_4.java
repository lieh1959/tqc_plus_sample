/* TQC+ JAVA6 - 607_4 */

public class JPA06_4 {
    public static void main(String[] arge){
        String[] map = { "北部" , "中部" , "南部" };
        int[][] salary = {
            { 120, 420, 315, 250, 418, 818, 900 },
            { 312, 183, 215, 89, 83, 600, 700 },
            { 215, 500, 430, 210, 300, 918, 880 }
        };
        int cost[] = {180, 200, 360};
        int cost1[] = {1500, 1515, 1858};
        int sum[] = {0, 0, 0};
        double data[] = {0, 0, 0};
        int i , j , i_max=3;
        double ratio;

        //透過兩層的for loop計算出各店的總營業額
        for(int b=0;b<salary.length;b++){
            for(int a=0;a<salary[b].length;a++){
                sum[b]+=salary[b][a];
            }
        }

        //計算每家的毛利率
        for(int a = 0;a<data.length;a++){
            data[a]=((sum[a]-cost[a]-cost1[a])/(double)(cost[a]+cost1[a])*100);
        }

        //顯示出資料
        for( i = 0 ; i <  i_max ; i++ ){
            System.out.print("第"+(i+1)+"間直營店銷售總成本="+(cost[i]+cost1[i])+"\n");
            System.out.print("銷售總營業額="+sum[i]+"\n");
            ratio = data[i];
            System.out.printf("銷售銷售毛利=%.2f",ratio);
            System.out.print("%\n");
            System.out.println();
        }
    }
}
