/* TQC+ JAVA6 - 509 */

//選擇排序法
public class JPA509{
    static int t = 0;
    public static void main(String[] argv) {
        int[] data = {1, 3, 2, 5, 4, 6};
            sort(data);
    }

    //設計一個選擇排序法方法
    public static void sort(int[] d){
        //先取得長度，比較次數為數量-1
        int LN = d.length-1;
        int i,j,min;

        for(i = 0 ; i < LN ; i++){
            //先將一開始的位置寫入
            min=i;
            for(j=(i+1);j<=LN;j++)
                if(d[j]<d[min])//如果比較到比它更小的，則將最小的寫入min
                    min=j;

            int temp = d[i];
            d[i] = d[min];
            d[min]=temp;

            for(int k=0;k<=LN;k++)
                System.out.print(d[k]+" ");
            System.out.println();
        }
    }
}
