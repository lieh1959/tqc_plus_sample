/* TQC+ JAVA6 - 605_3 */

abstract class MIS{
	private String name;
	private int chi;
	private int eng;
	//初始化人數為0
	private static  int count =0;
 	//每建立一次MIS物件時會使count++
	public MIS(String s,int i,int j){
		name = s;
		chi = i;
		eng = j;
		count++;
	}
	public abstract double averageElect();
	public double averageMust(){
		return (double)((chi+eng)/2.0);
	}
	public double averageAll(){
		return averageElect()*0.6 + averageMust()*0.4;
	}
	//設定取得count方法
	public static  int getCount(){
		return count;
	}
}

class IT extends MIS {
	private int pl;
	private int db;
	private int ds;

	IT(String s,int i,int j,int k,int l,int ii){
		super(s,i,j);
		pl=k;
		db=l;
		ds=ii;
	}
	public double averageElect(){
		return (pl+db+ds)/3.0;
	}
}

class IM extends MIS{
	private int econ;
	private int acct;
	IM(String s,int i,int j,int k ,int l){
		super(s,i,j);
		econ = k;
		acct =l;
	}
	public double averageElect(){
		return (econ+acct)/2.0;
	}
}

class ITM extends IT{
	private int acct;
	ITM(String s,int i,int j,int k,int l,int ii,int jj){
		super(s,i,j,k,l,ii);
		acct=jj;
	}
	public double averageElect(){
		return (super.averageElect()+acct)/2.0;
	}
	public double averageAll() {
		return (super.averageMust()*0.4 + super.averageElect()*0.4 + acct*0.2);
	}

}


public class JPA06_3 {
	public static void main(String argv[]) {
		MIS s1 = new IT("John", 88, 90, 76, 68, 84);
		MIS s2 = new IM("Paul", 92, 80, 76, 68);
		MIS s3 = new ITM("Mary", 79, 88, 94, 92, 83, 69);
        //System.out.printf("John's elect score: %.2f all score %.2f\n", s1.averageElect(), s1.averageAll());
        //System.out.printf("Paul's elect score: %.2f all score %.2f\n", s2.averageElect(), s2.averageAll());
        //System.out.printf("Mary's elect score: %.2f all score %.2f\n", s3.averageElect(), s3.averageAll());
		System.out.println("Total students: " + MIS.getCount());
	}
}
