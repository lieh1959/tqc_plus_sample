public class JPA507 {
    public static void main(String[] argv) {
        int hours = 0;   //停車時數
        hours = 2;
        park(hours);
        System.out.println("--------------------");
        hours = 3;
        park(hours);
        System.out.println("--------------------");
        hours = 5;
        park(hours);
        System.out.println("--------------------");
        hours = 8;
        park(hours);
    }
    //計算停車費用方法
    public static void park(int hours) {
        int[] hourTable = {0, 2, 4, 6};   //時段陣列
        int[] feeTable = {30, 50, 80, 100};   //時段費率陣列
        int fee = 0;   //總停車費用
        System.out.println("停車時數：" + hours + "小時");
        for(int a = 3 ;a>=0;a--)
        {
        //透過迴圈的方式，使用漏斗的方法，若符合條件則進入if判斷式	
        if(hours>hourTable[a])
        	{
        	//計算金額。原本的+(時數-非屬於此時段的時間)*該時段費率
        	fee=fee+(hours-hourTable[a])*feeTable[a];
        	//設定剩下的時間
        	hours=hourTable[a];
        	}
        }	
        System.out.println("應繳費用：" + fee + "元整");
    }
}