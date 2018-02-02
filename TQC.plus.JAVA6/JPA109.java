public class JPA109 { 
  
    public static int adder (int s1, int a1, int e1) { 
        //傳回加總後的數值回去，先傳到gameRating這個方法，再由gameRating傳回至main中
    	return (s1+a1+e1);                                    
    } 
   
    public static int gameRating (int s, int a, int e) { 
        //再將剛剛傳進來的傳入到adder這個方法中
    	return adder(s,a,e);                                      
    } 
  
    public static void main (String argv[]) { 
        int skill = 6, action = 9, excitment = 8, result; 
        //將數字傳入gameRating這個方法中
        result = gameRating(skill, action, excitment); 
        System.out.print("The rating of the game is "); 
        System.out.println(result);                        
    } 
} 
