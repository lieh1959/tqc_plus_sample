/* TQC+ JAVA6 - 601_1 */

//建立一個共有的方法
class Unit{
	int cost ;
	Unit(){
		cost = 0;
	}
	public int getCost(){
		return cost;
	}
}
//引擎方法，繼承Unit，取得成本方法
class Engine extends Unit {
	 Engine(int i){
		 if(i==1600)
			 cost=20000;
		 else
			 cost= 25000;
	 }
 }
//空調方法，繼承Unit，取得成本方法
class Aircond extends Unit{
	 Aircond(String s ) {
		 if(s.equals("auto"))
			 cost = 12000;
		 else
			 cost = 10000;
	 }
 }

//音響方法，繼承Unit，取得成本方法
 class Sound  extends Unit{
	 Sound(){
	 	cost = 2000;
	 }
 }

public class JPA06_1 {
    public static void main(String args[]){
        //產生一個1600cc引擎物件
    	Engine e1 = new Engine(1600);
        System.out.println("1600 cost: " + e1.getCost());
        //產生一個2000cc引擎物件
        Engine e2 = new Engine(2000);
        System.out.println("2000 cost: " + e2.getCost());
        //產生一個Auto空調物件
        Aircond a1 = new Aircond("auto");
        System.out.println("Auto: " + a1.getCost());
        //產生一個Manual空調物件
        Aircond a2 = new Aircond("manual");
        System.out.println("Manual: " + a2.getCost());
        //產生一個音響物件
        Sound s1 = new Sound();
        System.out.println("Stereo: " + s1.getCost());
    }
}