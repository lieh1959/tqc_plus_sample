package JPA609.JP06_1;
//建立BoundedStack的類別
class BoundedStack{
	String[] bs;
	int top=-1;
	int max;
	//初始化建構子
	BoundedStack(int i)
	{
		//設定陣列大小
		bs = new String[i];
		max = i;
	}
	//建立一個加元素到陣列的方法
	void push(String s)
	{
		if(top<max-1)
			bs[++top]=s;//先++將陣列一開始從-1變成0
		else
			System.out.println("stack-overflow");
	}
	//建立一個將元素從陣列中拋出(需要return值)
	String pop()
	{
		String s ;
		if(top>=0)
			s = bs[top--];//先將該位置的值拋出，再將index--
		else 
			s = "stack-is-empty";
		return s;
	}
	//建立一個方法判斷該陣列是否為空
	boolean empty()
	{
		return top == -1;
	}

}
public class JPD06_1 {
    public static void main(String args[]) {
        //設定陣列大小
    	BoundedStack s = new BoundedStack(3);
        //將元素加入到陣列中
        s.push("abc");
        s.push("def");
        s.push("ghi");
        //最後一個元素，因陣列大小不構，而無法寫入
        s.push("jkl");
        
        //拋出時，先進的會後拋出
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        //判斷陣列是否為空的
        System.out.println(s.empty());
    }
}