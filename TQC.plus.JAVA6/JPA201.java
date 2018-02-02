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
    //建立一個static的方法，來判斷是否有大於60
    public static void test(int c) {
      if(c>=60)
       System.out.println("You Pass");
      //以下這行不屬於if的判斷式之內，故無論if是否成立，皆會運作下列該行
      System.out.println("End");
    }
}
