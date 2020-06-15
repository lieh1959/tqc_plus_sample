/* TQC+ JAVA6 - 609_4 */

import java.util.LinkedList;
//這題主要是將先前回傳值為String的部分，改變成Object
abstract class stack
{
	stack(){}
	public abstract Object pop();
	public abstract void push(Object s);
	public Object top(){
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

	public Object pop(){
		if(!empty()){
			Object s = ubs.getFirst();
			ubs.removeFirst();
			return s;
		} else {
			return null;
		}
	}
}

public class JPA06_4 {
    public static void main(String args[]) {
        UnboundedStack s = new UnboundedStack();
        s.push("abc");
        s.push(2);
        s.push("ghi");
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
