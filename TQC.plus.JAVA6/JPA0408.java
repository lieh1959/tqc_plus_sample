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
    	if(s.equals(""))//�p�G�ǤJ�r�ꬰ�šA�h�^��s�r��
    		return s;
    	else//�N�r�ꪺ�Ĥ@�Ӧr���q���֥[�W�h�A�M��ǤJ���r��h�O�z�LsubstringŪ�X��m1���᪺�Ҧ��r��öǤJreverse
    		return reverse(s.substring(1))+s.substring(0, 1);
    	
    }
}