import java.util.Scanner;

public class JPA105{
public static void main (String[] args)
{
    System.out.print("�п�J�z���m�W:");
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    System.out.printf("Hi, %s,�п�J�z���ɪO���Ӽ�:\n",name);
    System.out.print("�п�J1�����ƶq:");
    int n1 = sc.nextInt();
    System.out.print("�п�J5�����ƶq:");
    int n5 = sc.nextInt();
    System.out.print("�п�J10�����ƶq:");
    int n10 = sc.nextInt();
    System.out.print("�п�J50�����ƶq:");
    int n50 = sc.nextInt();
    
    int sum,G1,G2,G3,G4;
    sum = n1*1 + n5*5 + n50*50 +n10*10; 
    //�N�`���B���H1000�A�p���I�e���ȳѤd��Ƴo�ӼơA�åѯB�I�Ʀs�ܾ�ơA�᭱�p���I�ҷ|����
    G1 =  sum/1000;
    //�N�`���B���H100�A�p���I�e���ȳѤd��ƩM�ʦ�Ƴo��ơA�A�i��mod�B��A���H10�Ҿl���ơA�o�˫K�ȷ|�s�b�ʦ��
    G2 = (sum/100)%10;
  //�N�`���B���H10�A�p���I�e���ȳѤd��ƩM�ʦ�ƩM�Q��Ƴo�T�ơA�A�i��mod�B��A���H10�Ҿl���ơA�o�˫K�ȷ|�s�b�Q���
    G3 = (sum/10)%10;
  //�N�`���B�i��mod�B��A���H10�Ҿl���ơA�o�˫K�ȷ|�s�b�Ӧ��
    G4 = sum%10;
    System.out.printf("�z�����`�@��: %d �d %d �� %d �Q %d ��",G1,G2,G3,G4);
}
}



