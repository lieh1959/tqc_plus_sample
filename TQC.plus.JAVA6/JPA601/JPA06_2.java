/* TQC+ JAVA6 - 601_2 */

class Unit{
	int cost ;
	Unit(){cost = 0;}
	public int getCost(){return cost;}
}

class Engine extends Unit {
	Engine(int i){
		if(i==1600)
			cost=20000;
		else
			cost= 25000;
	}
}

class Aircond extends Unit{
	Aircond(String s ){
		if(s.equals("Auto"))
			cost = 12000;
		else
			cost = 10000;
	}
}

class Sound  extends Unit{
	Sound(){
		cost = 2000;
	}
}
 //�إߤ@��Car�@������k
abstract class Car{
	Engine e;
	Aircond a;
	Car(int i,String s){
		e = new Engine(i);
		a = new Aircond(s);
	}

	public abstract double cost();
	public double price(){
		return cost() *1.2;
	}
}

//�إߤ@�Ӱ򥻫����ؤ�k�A�~��Car��k
class BasicCar extends Car{
	public BasicCar(int i ,String s ){
		super(i,s);
	}
	public double cost(){
		return e.getCost()+a.getCost()+5000;
	}
}
//�إߤ@�ӻ��ب��ؤ�k�A�~��Car��k
class LuxCar extends Car{
	public LuxCar(int i ,String s ){
		super(i,s);
	}
	public double cost(){
		return e.getCost()+a.getCost()+10000;
	}
}

public class JPA06_2 {
	public static void main(String args[]){
        //���ͤ@�Ӱ򥻨��ت�����
		BasicCar bc = new BasicCar(1600,"Manual");
		System.out.println("Basic cost: " + bc.cost());
		System.out.println("Basic price: " + bc.price());
        //���ͤ@�ӻ��ب��ت�����
		LuxCar lc = new LuxCar(2000,"Auto");
		System.out.println("Lux cost: " + lc.cost());
		System.out.println("Lux price: " + lc.price());
	}
}