package JPA601.JP06_3;
class Unit{
	int cost ;
	Unit(){
		cost = 0;
	}
	public int getCost()
	{return cost;}
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
	 Aircond(String s )
	 {
		 if(s.equals("Auto"))
			 cost = 12000;
		 else 
			 cost = 10000;
	 }
 }


 class Sound  extends Unit{
	 Sound(){cost = 2000;}
 }
 
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

class LuxCar extends Car{
	public LuxCar(int i ,String s )
	{super(i,s);}	
	public double cost()
	{return e.getCost()+a.getCost()+10000;}
}

//建立一個超級豪華車款
class SLuxCar extends Car{
	public SLuxCar(int i ,String s )
	//原本的引擎和空調
	{super(i,s);}	
	Sound sc = new Sound();
	public double cost()
	{return e.getCost()+a.getCost()+10000+sc.getCost();}
	
	public String expensive (LuxCar lc)
	{
		if(lc.price()<price())
			return "YES";
		else 
			return "no";
	}
}

public class JPD06_3 {
    public static void main(String args[]) {
        SLuxCar llc = new SLuxCar(2000,"Auto");
        System.out.println("SLux cost: "  + llc.cost());
        System.out.println("SLux price: " + llc.price());
        LuxCar lc = new LuxCar(2000,"Auto");
        System.out.println("Is llc more expensive than lc? " + llc.expensive(lc));
   }
}