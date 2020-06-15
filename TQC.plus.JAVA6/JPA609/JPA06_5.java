/* TQC+ JAVA6 - 609_5 */

import java.util.LinkedList;

abstract class stack{
	stack(){}
	//��X���~�ɡA���n��XException�A�ӬO��X�ۦ漶�g�����~���O�W��
	public abstract Object pop() throws exnull;
	public abstract void push(Object s);
	//�s�W�ߥX���~���\��
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
			//�e�X�D�b�o��|����print�X�ӿ��~�T���A�o��h�O�N��T�]�bexception�ߥX��
			throw new exnull("Stack is empty!!");
		}
	}
}
//�s�W�@�����O�A�~��Exception
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
        //������~�ɡA�ϥΦۦ漶�g��exception��k
        }catch(exnull e){
        }
    }
}
