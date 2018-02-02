package JPA607.JP06_5;

  public class JPD06_5 {
   public static void main(String[] arge){
       
	   int[][] salary = {{ 120 , 420 , 315 , 250 , 418,818,900 } , { 312 , 183 , 215 , 89 , 83,600,700 } , { 215 , 500 , 430 , 210 , 300,918,880 }};
       int cost,sum=0;
       double ratio;
       cost=1500+1515+1858+180+200+360;
       
       //利用兩層的for loop計算出總營業額
       for(int b=0;b<salary.length;b++)
       {for(int a=0;a<salary[b].length;a++){sum+=salary[b][a];}}
       //計算出毛利率
       ratio=(double)(sum-cost)/cost*100;
            
       System.out.print("總銷售總成本="+cost);
       System.out.println();
       System.out.print("總銷售總營業額="+sum);
       System.out.println();
       System.out.printf("總銷售銷售毛利率=%.2f",ratio);
       System.out.print("%");
       System.out.println();
       }
   }
