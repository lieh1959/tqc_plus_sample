import java.util.*;
class JPA210 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        test();
        test();
        test();
    }
  
    public static void test() {
    	System.out.println("Input a character:");
        Scanner sc = new Scanner(System.in);
        //Ū���r��
        String tm = sc.next();
        //���^���ۦꪺ�Ĥ@�Ӧr��
        char tm0 = tm.charAt(0);  
        switch(tm0)
        {
        case 'a'://�o�䤣�ݭn�S�O�h�B�z�A�]���S���gbreak�A�ҥH�|�~��]��case 'B'�����e�A����I��break
        case 'b':
            System.out.println("You entered a or b");
            break;

        case 'x':
            System.out.println("You entered x");
            break;

        case 'y': 
            System.out.println("You entered y");
            break;

        default:
            System.out.println("You entered something else.");
            break;
    };
   }
}