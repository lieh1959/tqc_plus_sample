//選擇排序法
public class JPA509{
    static int t = 0;
	public static void main(String[] argv) {
        int[] data = {1, 3, 2, 5, 4, 6};
        int[] show = new int[data.length];
        //總共要比較的次數
        for(int a=0;a<data.length-1;a++)
        	  {
        	   show=sort(data);
        	   System.out.println("");
        	  }
    }
    public static int[] sort(int[] d)
    {
    	int temp =0;
    	//先將每次要比較的初始index寫入一個變數，然後一直比較到其index小於陣列長度
		for(int c=t;c<d.length;c++)
		{
			if(d[t]>d[c])
			{
				temp=d[t];
				d[t]=d[c];
				d[c]=temp;
			}		
		}
		//將t值+1，為下一個迴圈要比較的初始index後移一個
		t++;
		for(int b=0;b<d.length;b++)
 		   System.out.print(d[b]+" ");
			return d;
    }
}