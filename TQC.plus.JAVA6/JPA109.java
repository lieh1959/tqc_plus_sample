public class JPA109 { 
  
    public static int adder (int s1, int a1, int e1) { 
        //�Ǧ^�[�`�᪺�ƭȦ^�h�A���Ǩ�gameRating�o�Ӥ�k�A�A��gameRating�Ǧ^��main��
    	return (s1+a1+e1);                                    
    } 
   
    public static int gameRating (int s, int a, int e) { 
        //�A�N���Ƕi�Ӫ��ǤJ��adder�o�Ӥ�k��
    	return adder(s,a,e);                                      
    } 
  
    public static void main (String argv[]) { 
        int skill = 6, action = 9, excitment = 8, result; 
        //�N�Ʀr�ǤJgameRating�o�Ӥ�k��
        result = gameRating(skill, action, excitment); 
        System.out.print("The rating of the game is "); 
        System.out.println(result);                        
    } 
} 
