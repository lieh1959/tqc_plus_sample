/* TQC+ JAVA6 - 605_1 */

//建立一個抽象屬性的方法
abstract class MIS{
	private String name;
	private int chi;
	private int eng;
	//建立建構子，初始化姓名、國文成績、英文成績
	public MIS(String s,int i,int j)
	{name = s;chi = i;eng = j;}
	//建立抽象方法，須在繼承的class中實作
	public abstract double averageElect();
	//建立平均計算方法
	public double averageAll()
	{return averageElect()*0.6 + (double)((chi+eng)/2.0)*0.4;}
}

//繼承MIS
class IT extends MIS {
	private int pl;
	private int db;
	private int ds;
	//建構子初始化必修成績和選修成績
	IT(String s,int i,int j,int k,int l,int ii)
	{
		super(s,i,j);
		pl=k;
		db=l;
		ds=ii;
	}
	public double averageElect(){return (pl+db+ds)/3.0;}
}
//繼承MIS
class IM extends MIS{
	private int econ;
	private int acct;
	//建構子初始化必修成績和選修成績
	IM(String s,int i,int j,int k ,int l)
	{
		super(s,i,j);
		econ = k;
		acct =l;
	}
	public double averageElect(){return (econ+acct)/2.0;}

}

public class JPA06_1 {
    public static void main(String argv[]) {
        //建立MIS物件IT和IM
    	MIS s1 = new IT("John", 88, 90, 76, 68, 84);
        MIS s2 = new IM("Paul", 92, 80, 76, 68);
        System.out.printf("John's elect score: %.2f all score %.2f\n", s1.averageElect(), s1.averageAll());
        System.out.printf("Paul's elect score: %.2f all score %.2f\n", s2.averageElect(), s2.averageAll());

    }
}