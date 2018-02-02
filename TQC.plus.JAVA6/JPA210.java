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
        //讀取字串
        String tm = sc.next();
        //僅擷取自串的第一個字元
        char tm0 = tm.charAt(0);  
        switch(tm0)
        {
        case 'a'://這邊不需要特別去處理，因為沒有寫break，所以會繼續跑到case 'B'的內容，直到碰到break
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