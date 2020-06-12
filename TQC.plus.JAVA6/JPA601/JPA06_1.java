/* TQC+ JAVA6 - 601_1 */

//�إߤ@�Ӧ@������k
class Unit{
	int cost ;
	Unit(){
		cost = 0;
	}
	public int getCost(){
		return cost;
	}
}
//������k�A�~��Unit�A���o������k
class Engine extends Unit {
	 Engine(int i){
		 if(i==1600)
			 cost=20000;
		 else
			 cost= 25000;
	 }
 }
//�Žդ�k�A�~��Unit�A���o������k
class Aircond extends Unit{
	 Aircond(String s ) {
		 if(s.equals("auto"))
			 cost = 12000;
		 else
			 cost = 10000;
	 }
 }

//���T��k�A�~��Unit�A���o������k
 class Sound  extends Unit{
	 Sound(){
	 	cost = 2000;
	 }
 }

public class JPA06_1 {
    public static void main(String args[]){
        //���ͤ@��1600cc��������
    	Engine e1 = new Engine(1600);
        System.out.println("1600 cost: " + e1.getCost());
        //���ͤ@��2000cc��������
        Engine e2 = new Engine(2000);
        System.out.println("2000 cost: " + e2.getCost());
        //���ͤ@��Auto�Žժ���
        Aircond a1 = new Aircond("auto");
        System.out.println("Auto: " + a1.getCost());
        //���ͤ@��Manual�Žժ���
        Aircond a2 = new Aircond("manual");
        System.out.println("Manual: " + a2.getCost());
        //���ͤ@�ӭ��T����
        Sound s1 = new Sound();
        System.out.println("Stereo: " + s1.getCost());
    }
}