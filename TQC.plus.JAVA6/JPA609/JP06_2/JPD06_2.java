package JPA609.JP06_2;

import java.util.LinkedList;

//建立一個UnboundedStack的類別
class UnboundedStack{
	LinkedList ubs;
	//建構子初始化為LinkedList
	UnboundedStack()
	{
		ubs = new LinkedList();
	}
	//建立判斷方法，確定該陣列是否為空
	boolean empty()
	{
		return ubs.size() == 0;
	}
	//建立將元素放入陣列的方法
	void push(String s)
	{
		//主要是透過內建的函數來控制
		ubs.addFirst(s);
	}
	//建立將元素拋出的方法
	String pop()
	{
		if(!empty())
		{
			//取得第一個元素後，將第一個元素值移除
			String s = (String)ubs.getFirst();
			ubs.removeFirst();
			return s;
		}
		else
		{
			return "Stack is empty!!";
		}
	}
	
}

public class JPD06_2 {
    public static void main(String args[]) {
        UnboundedStack s = new UnboundedStack();
        s.push("abc");
        s.push("def");
        s.push("ghi");
        s.push("jkl");

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        //檢查陣列是否為空的，因仍有一個元素在陣列中，回傳false
        System.out.println(s.empty());
        System.out.println(s.pop());
        System.out.println(s.empty());
    }
}