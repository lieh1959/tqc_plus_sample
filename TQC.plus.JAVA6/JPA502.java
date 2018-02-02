import java.util.Scanner;
public class JPA502 {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.print("請輸入學生人數：");
        Scanner sc = new Scanner(System.in);
        int poe = sc.nextInt();
        float sum = 0;
        float[] ps = new float[poe];
        //迴圈次數決定可輸入幾個學生成績，而迴圈次數由使用者輸入
        for(int a =0;a<poe;a++)
        {
        	System.out.print("第"+(a+1)+"個學生的成績:");
        	ps[a]=sc.nextFloat();
        	sum +=ps[a];
        }
        System.out.println("人數:"+poe);
        System.out.println("總分:"+sum);
        System.out.println("平均:"+sum/poe);
    }
}