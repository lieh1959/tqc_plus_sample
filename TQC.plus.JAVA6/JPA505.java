public class JPA505 {
    public static void main(String[] argv) {
        String[] data = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        System.out.print("反轉陣列資料之前： ");
        for(int a=0;a<10;a++)
        	System.out.print(data[a]+" ");
        data=reverse(data);
        System.out.print("\n反轉陣列資料之後： ");
        for(int a=0;a<10;a++)
        	System.out.print(data[a]+" ");
    }
    //反轉方法
    //其翻轉方法主要是，宣告一個新的陣列，將原陣列寫到暫時的陣列中，並且用倒著的方法來寫，最後將這個暫時的陣列傳回main方法之中
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