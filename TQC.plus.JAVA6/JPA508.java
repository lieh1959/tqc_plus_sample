/* TQC+ JAVA6 - 508 */

//泡泡排序法
public class JPA508 {
    public static void main(String[] args){
        int data[] = {2,4,3,5,7,6,9,1};//未排序資料
        //先取出陣列長度
        int LN = data.length-1;

        for(int i=0;i<LN;i++){
            for(int j = 0;j<LN;j++){
                //如果後面那位數字小於前面那數字則交換
                if(data[j]>data[j+1]){
                    int temp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = temp;
                }
            }
            //每做完一次排序，便顯示出結果
            for(int x=0;x<=LN;x++)
                System.out.print(data[x]+" ");
            System.out.println("");
        }
    }
}
