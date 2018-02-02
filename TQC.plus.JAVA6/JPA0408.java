import java.util.Scanner;
public class JPD0408 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        String s, c; 
        System.out.print("Input a string: ");
        s = keyboard.nextLine();
        System.out.printf("%s\n", reverse(s));
        System.out.print("Input a string: ");
        s = keyboard.nextLine();
        System.out.printf("%s\n", reverse(s));
    }
    
    static String reverse(String s )
    {
    	if(s.equals(""))//如果傳入字串為空，則回傳s字串
    		return s;
    	else//將字串的第一個字元從後方累加上去，然後傳入的字串則是透過substring讀出位置1之後的所有字串並傳入reverse
    		return reverse(s.substring(1))+s.substring(0, 1);
    	
    }
}