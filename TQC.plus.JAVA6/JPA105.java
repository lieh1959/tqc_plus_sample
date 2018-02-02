import java.util.Scanner;

public class JPA105{
public static void main (String[] args)
{
    System.out.print("叫块眤﹎:");
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    System.out.printf("Hi, %s,叫块眤簧狾计:\n",name);
    System.out.print("叫块1じ计秖:");
    int n1 = sc.nextInt();
    System.out.print("叫块5じ计秖:");
    int n5 = sc.nextInt();
    System.out.print("叫块10じ计秖:");
    int n10 = sc.nextInt();
    System.out.print("叫块50じ计秖:");
    int n50 = sc.nextInt();
    
    int sum,G1,G2,G3,G4;
    sum = n1*1 + n5*5 + n50*50 +n10*10; 
    //盢羆肂埃1000计翴玡度逞计硂计パ疊翴计俱计计翴穦ア
    G1 =  sum/1000;
    //盢羆肂埃100计翴玡度逞计㎝κ计硂ㄢ计秈︽mod笲衡埃10┮緇计硂妓獽度穦κ计
    G2 = (sum/100)%10;
  //盢羆肂埃10计翴玡度逞计㎝κ计㎝计硂计秈︽mod笲衡埃10┮緇计硂妓獽度穦计
    G3 = (sum/10)%10;
  //盢羆肂秈︽mod笲衡埃10┮緇计硂妓獽度穦计
    G4 = sum%10;
    System.out.printf("眤窥羆Τ: %d  %d κ %d  %d じ",G1,G2,G3,G4);
}
}



