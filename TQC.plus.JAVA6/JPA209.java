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
        System.out.print("�п�J x �y��:");
        x = sc.nextDouble();
        System.out.print("�п�J y �y��:");
        y = sc.nextDouble();
       
        if(x==0.0&&y==0.0)
        	System.out.printf("(%1.2f,%1.2f)�b���I�W\n",x,y);
        
        else if (x==0.0)
        	System.out.printf("(%1.2f,%1.2f)�by�b�W\n",x,y);
        else if (y==0.0)
        	System.out.printf("(%1.2f,%1.2f)�bx�b�W\n",x,y);
        else if (x>0.0&&y>0.0)
        	System.out.printf("(%1.2f,%1.2f)�b�Ĥ@�H���W\n",x,y);
        else if (x<0.0&&y>0.0)
        	System.out.printf("(%1.2f,%1.2f)�b�ĤG�H���W\n",x,y);
        else if (x<0.0&&y<0.0)
        	System.out.printf("(%1.2f,%1.2f)�b�ĤT�H���W\n",x,y);
        else if (x>0.0&&y<0.0)
        	System.out.printf("(%1.2f,%1.2f)�b�ĥ|�H���W\n",x,y);
    }
}
