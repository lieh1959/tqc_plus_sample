/* TQC+ JAVA6 - 609_5 */

import java.util.LinkedList;

abstract class stack{
	stack(){}
	//丟出錯誤時，不要丟出Exception，而是丟出自行撰寫的錯誤類別名稱
	public abstract Object pop() throws exnull;
	public abstract void push(Object s);
	//新增拋出錯誤的功能
	public Object top() throws exnull{
		Object s = pop();
		push(s);
		return s;
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

	public void push(Object s){
		ubs.addFirst(s);
	}

	public Object pop() throws exnull{
		if(!empty()){
			Object s = ubs.getFirst();
			ubs.removeFirst();

			return s;
		} else {
			//前幾題在這邊會直接print出來錯誤訊息，這邊則是將資訊包在exception拋出來
			throw new exnull("Stack is empty!!");
		}
	}
}
//新增一個類別，繼承Exception
class exnull extends Exception{
	exnull(String s){
		System.out.println(s);
	}
}

public class JPA06_5 {
    public static void main(String args[]) {
        try {
            UnboundedStack s = new UnboundedStack();
            s.push("abc");
            s.push(2);
            s.push("ghi");
            System.out.println(s.top());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
        //抓取錯誤時，使用自行撰寫的exception方法
        }catch(exnull e){
        }
    }
}
