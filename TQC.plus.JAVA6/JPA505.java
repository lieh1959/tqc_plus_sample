public class JPA505 {
    public static void main(String[] argv) {
        String[] data = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        System.out.print("����}�C��Ƥ��e�G ");
        for(int a=0;a<10;a++)
        	System.out.print(data[a]+" ");
        data=reverse(data);
        System.out.print("\n����}�C��Ƥ���G ");
        for(int a=0;a<10;a++)
        	System.out.print(data[a]+" ");
    }
    //�����k
    //��½���k�D�n�O�A�ŧi�@�ӷs���}�C�A�N��}�C�g��Ȯɪ��}�C���A�åB�έ˵۪���k�Ӽg�A�̫�N�o�ӼȮɪ��}�C�Ǧ^main��k����
    public static String[] reverse(String[] s) {
        String[] temp = new String[s.length];
    	int b=9;
        for(int a=0;a<10;a++)
        {
        	temp[b]=s[a];
        	b--;
        }
    return temp;
    }
}