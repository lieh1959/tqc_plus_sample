import java.util.Scanner;
class JPA309 {
    public static void main(String argv[]){
        int size = new Scanner(System.in).nextInt();
        int sum = 0;
        //累加的迴圈
        for(int a=1 ;a<=size;a++)
        {
        	//條件判斷，當a整除3或者整除5，則進入處理
        	if(a%3==0 ||a%5==0)
        	{
        		//當在此判斷中，符合a整除7的數字，則直接結束該次迴圈以下的所有程式碼，從下一個迴圈開始
        		if(a%7==0)
        			continue;
        		sum = sum +a;
        	}
        }
                
        System.out.println("Answer: " + sum);
    }
}
