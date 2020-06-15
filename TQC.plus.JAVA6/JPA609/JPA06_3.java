/* TQC+ JAVA6 - 609_3 */

/*
 * ���D�D�n�O��X�e���D�A�e���D���ϧO�b��
 * �Ĥ@�D:�ϥΰ}�C�A���ϥΪ̦ۦ�h����}�C��index�ȡA�M�w�ߥX�P��J���\��
 * �ĤG�D:�ϥΨ�}�C����k�\�����ϥΪ̯�I�s�禡�h�����ƪ��i�X
 */

import java.util.LinkedList;
//�إߤ@�ө�H��stack���O
abstract class stack{
	stack(){}
	//�إߩ�H����k�A�ݤl���O�ӹ�@
	public abstract String pop();
	public abstract void push(String s);
	//�إߤ@�Ӥ�k�A�i�H�ٶ�
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
//�~��UnboundedStack�A�s�W��k���o�}�C�j�p
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
        //���o�}�C�j�p
        System.out.println(s2.getSize());
        //�i��top��k(���ߥX���^)
        System.out.println(s2.top());
        //����ߥX
        System.out.println(s2.pop());
        System.out.println(s2.pop());
        System.out.println(s2.pop());
        System.out.println(s2.empty());
        System.out.println(s2.pop());
        System.out.println(s2.empty());
        System.out.println(s2.getSize());
    }
}
