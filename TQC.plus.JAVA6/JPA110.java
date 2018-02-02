public class JPA110 {
    public static void main(String args[]) {
        double totalarea;
        System.out.printf("圓形面積為：%f \n",calCircle(5));
        System.out.printf("三角形面積為：%f \n",calTriangle(10,5));
        System.out.printf("方形面積為：%f \n",calRectangle(10,5));
        totalarea = calCircle(5) + calTriangle(10,5) + calRectangle(10,5) ;
        System.out.printf("此圖形面積為：%f \n",totalarea);
    }
    //宣告一個計算圓面積的方法
    public static double calCircle(int a) {
    	return (a*a*3.1415926);    
    }
    //宣告一個計算三角形面積的方法
    public static double calTriangle(int a,int b) {
    	//記得要將a*b的乘積強制轉型成double，這樣除出來數字才會保留小數部分
    	return ((double)(a*b)/2);
    }
    //宣告一個計算長方形面積的方法
    public static int calRectangle(int a,int b) {
    	return (a*b);
    }
}
