package JPA609.JP06_2;

import java.util.LinkedList;

//�إߤ@��UnboundedStack�����O
class UnboundedStack{
	LinkedList ubs;
	//�غc�l��l�Ƭ�LinkedList
	UnboundedStack()
	{
		ubs = new LinkedList();
	}
	//�إߧP�_��k�A�T�w�Ӱ}�C�O�_����
	boolean empty()
	{
		return ubs.size() == 0;
	}
	//�إ߱N������J�}�C����k
	void push(String s)
	{
		//�D�n�O�z�L���ت���ƨӱ���
		ubs.addFirst(s);
	}
	//�إ߱N�����ߥX����k
	String pop()
	{
		if(!empty())
		{
			//���o�Ĥ@�Ӥ�����A�N�Ĥ@�Ӥ����Ȳ���
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
        //�ˬd�}�C�O�_���Ū��A�]�����@�Ӥ����b�}�C���A�^��false
        System.out.println(s.empty());
        System.out.println(s.pop());
        System.out.println(s.empty());
    }
}