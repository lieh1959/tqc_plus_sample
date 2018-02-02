import java.util.*;
public class JPA209 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();        
        test();
        test();
        test();
    }
    
    public static void test() {
    	
        Scanner sc = new Scanner(System.in);
        double x,y; 
        System.out.print("請輸入 x 座標:");
        x = sc.nextDouble();
        System.out.print("請輸入 y 座標:");
        y = sc.nextDouble();
       
        if(x==0.0&&y==0.0)
        	System.out.printf("(%1.2f,%1.2f)在原點上\n",x,y);
        
        else if (x==0.0)
        	System.out.printf("(%1.2f,%1.2f)在y軸上\n",x,y);
        else if (y==0.0)
        	System.out.printf("(%1.2f,%1.2f)在x軸上\n",x,y);
        else if (x>0.0&&y>0.0)
        	System.out.printf("(%1.2f,%1.2f)在第一象限上\n",x,y);
        else if (x<0.0&&y>0.0)
        	System.out.printf("(%1.2f,%1.2f)在第二象限上\n",x,y);
        else if (x<0.0&&y<0.0)
        	System.out.printf("(%1.2f,%1.2f)在第三象限上\n",x,y);
        else if (x>0.0&&y<0.0)
        	System.out.printf("(%1.2f,%1.2f)在第四象限上\n",x,y);
    }
}
