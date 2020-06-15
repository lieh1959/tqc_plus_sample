/* TQC+ JAVA6 - 609_3 */

/*
 * 該題主要是整合前兩題，前兩題的區別在於
 * 第一題:使用陣列，讓使用者自行去控制陣列的index值，決定拋出與堆入的功能
 * 第二題:使用到陣列的方法功能讓使用者能呼叫函式去控制資料的進出
 */

import java.util.LinkedList;
//建立一個抽象的stack類別
abstract class stack{
	stack(){}
	//建立抽象的方法，待子類別來實作
	public abstract String pop();
	public abstract void push(String s);
	//建立一個方法，可以還傳
	public String top(){
		String s = pop();
		push(s);
		return s;
	}
}

class BoundedStack extends stack{
	String[] bs;
	int top=-1;
	int max;
	BoundedStack(int i){
		bs = new String[i];
		max = i;
	}
	public void push(String s){
		if(top<max-1)
			bs[++top]=s;
		else
			System.out.println("stack-overflow");
	}
	public String pop(){
		String s ;
		if(top>=0)
			s = bs[top--];
		else
			s = "stack-is-empty";
		return s;
	}

	boolean empty(){
		return top == -1;
	}
}

class UnboundedStack extends stack{
	LinkedList ubs;
	UnboundedStack(){
		ubs = new LinkedList();
	}

	boolean empty(){
		return ubs.size() == 0;
	}

	public void push(String s){
		ubs.addFirst(s);
		System.out.println("Pushing:"+s);
	}

	public String pop(){
		if(!empty()){
			String s = (String)ubs.getFirst();
			ubs.removeFirst();
			System.out.println("Poping:"+s);
			return s;
		} else {
			return "Stack is empty!!";
		}
	}
}
//繼承UnboundedStack，新增方法取得陣列大小
class TraceUnboundedStack extends UnboundedStack{
	int getSize(){
		return ubs.size();
	}
}


public class JPA06_3 {
    public static void main(String args[]) {
        TraceUnboundedStack s2 = new TraceUnboundedStack();
        s2.push("abc");
        s2.push("def");
        s2.push("ghi");
        s2.push("jkl");
        //取得陣列大小
        System.out.println(s2.getSize());
        //進行top方法(先拋出後堆回)
        System.out.println(s2.top());
        //持續拋出
        System.out.println(s2.pop());
        System.out.println(s2.pop());
        System.out.println(s2.pop());
        System.out.println(s2.empty());
        System.out.println(s2.pop());
        System.out.println(s2.empty());
        System.out.println(s2.getSize());
    }
}
