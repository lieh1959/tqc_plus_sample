import java.util.Scanner;
public class JPA201 {
    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Please enter score");
        Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
        test(a);
        int b = sc.nextInt();
        test(b);
    }
    //�إߤ@��static����k�A�ӧP�_�O�_���j��60
    public static void test(int c) {
      if(c>=60)
       System.out.println("You Pass");
      //�H�U�o�椣�ݩ�if���P�_�������A�G�L��if�O�_���ߡA�ҷ|�B�@�U�C�Ӧ�
      System.out.println("End");
    }
}
