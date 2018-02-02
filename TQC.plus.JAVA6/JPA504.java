public class JPA504 {
    public static void main(String[] args) {
        int[] n = new int[10];
        //初始化前兩個數
        n[0]=0;
        n[1]=1;
        //費式數列前十個
        for(int a=2;a<10;a++)
        	n[a]=n[a-1]+n[a-2];//陣列的index由2開始，其目的在於相加前面兩個index=1 and 0
        for(int a=0;a<10;a++)
        	System.out.println(n[a]);
    }
}