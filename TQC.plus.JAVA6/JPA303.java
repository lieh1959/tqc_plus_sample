public class JPA303 {
    public static void main(String[] args) {
        int i, j, sum = 0;
        System.out.printf("1~1000中的完美數有: ");
        
        for (j=2;j<1000;j++){//第一層迴圈從2跑到1000
            sum=0;
            for (i=1;i<j;i++) //第二層迴圈從1跑到第一層迴圈的數字便停止
                if(j%i==0)//在其中，若有兩數相為j的因數，則將它加入總和中
                	sum = sum + i;
         //若最後的總合等於本身該數，則印出銀幕來
         if(sum==j) 
            System.out.printf("%d ",j); 
        }
    }
}