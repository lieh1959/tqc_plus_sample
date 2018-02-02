package JPA609.JP06_1;
//�إ�BoundedStack�����O
class BoundedStack{
	String[] bs;
	int top=-1;
	int max;
	//��l�ƫغc�l
	BoundedStack(int i)
	{
		//�]�w�}�C�j�p
		bs = new String[i];
		max = i;
	}
	//�إߤ@�ӥ[������}�C����k
	void push(String s)
	{
		if(top<max-1)
			bs[++top]=s;//��++�N�}�C�@�}�l�q-1�ܦ�0
		else
			System.out.println("stack-overflow");
	}
	//�إߤ@�ӱN�����q�}�C���ߥX(�ݭnreturn��)
	String pop()
	{
		String s ;
		if(top>=0)
			s = bs[top--];//���N�Ӧ�m���ȩߥX�A�A�Nindex--
		else 
			s = "stack-is-empty";
		return s;
	}
	//�إߤ@�Ӥ�k�P�_�Ӱ}�C�O�_����
	boolean empty()
	{
		return top == -1;
	}

}
public class JPD06_1 {
    public static void main(String args[]) {
        //�]�w�}�C�j�p
    	BoundedStack s = new BoundedStack(3);
        //�N�����[�J��}�C��
        s.push("abc");
        s.push("def");
        s.push("ghi");
        //�̫�@�Ӥ����A�]�}�C�j�p���c�A�ӵL�k�g�J
        s.push("jkl");
        
        //�ߥX�ɡA���i���|��ߥX
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        //�P�_�}�C�O�_���Ū�
        System.out.println(s.empty());
    }
}