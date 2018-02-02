//獁獁逼猭 
public class JPA508 {
    public static void main(String[] argv) {
        int[] data = {2, 4, 3, 5, 7, 6, 9, 1};  // 逼戈 8
        int size = data.length;
        //羆穦ゑ耕7Ω
        for(int c=0;c<7;c++)
        {
        //–Ωゑ耕Ω计皚程index
        for(int a=0;a<(size-1);a++)
        {
        	//狦计玡计玥秈︽ユ传
        	if(data[a+1]<data[a]) 
        	{
        	int temp = 0;
        	temp=data[a+1];
        	data[a+1]=data[a];
        	data[a]=temp;
        	}
        }   
        for(int b=0;b<size;b++)
        	System.out.print(" "+data[b]);
        System.out.println("");
        }
    }
}