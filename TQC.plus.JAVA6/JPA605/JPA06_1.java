/* TQC+ JAVA6 - 605_1 */

//�إߤ@�ө�H�ݩʪ���k
abstract class MIS{
	private String name;
	private int chi;
	private int eng;
	//�إ߫غc�l�A��l�Ʃm�W�B��妨�Z�B�^�妨�Z
	public MIS(String s,int i,int j)
	{name = s;chi = i;eng = j;}
	//�إߩ�H��k�A���b�~�Ӫ�class����@
	public abstract double averageElect();
	//�إߥ����p���k
	public double averageAll()
	{return averageElect()*0.6 + (double)((chi+eng)/2.0)*0.4;}
}

//�~��MIS
class IT extends MIS {
	private int pl;
	private int db;
	private int ds;
	//�غc�l��l�ƥ��צ��Z�M��צ��Z
	IT(String s,int i,int j,int k,int l,int ii)
	{
		super(s,i,j);
		pl=k;
		db=l;
		ds=ii;
	}
	public double averageElect(){return (pl+db+ds)/3.0;}
}
//�~��MIS
class IM extends MIS{
	private int econ;
	private int acct;
	//�غc�l��l�ƥ��צ��Z�M��צ��Z
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
        //�إ�MIS����IT�MIM
    	MIS s1 = new IT("John", 88, 90, 76, 68, 84);
        MIS s2 = new IM("Paul", 92, 80, 76, 68);
        System.out.printf("John's elect score: %.2f all score %.2f\n", s1.averageElect(), s1.averageAll());
        System.out.printf("Paul's elect score: %.2f all score %.2f\n", s2.averageElect(), s2.averageAll());

    }
}