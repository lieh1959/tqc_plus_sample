/* TQC+ JAVA6 - 601_5 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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
	Aircond(String s ) {
		if(s.equals("auto"))
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

class BasicCar extends Car{
	public BasicCar(int i ,String s ){
		super(i,s);
	}
	public double cost(){
		return e.getCost()+a.getCost()+5000;
	}
}

class LuxCar extends Car{
	public LuxCar(int i ,String s ){
		super(i,s);
	}
	public double cost(){
		return e.getCost()+a.getCost()+10000;
	}
}

class SLuxCar extends Car{
	public SLuxCar(int i ,String s ){
		super(i,s);
	}
	Sound sc = new Sound();
	public double cost(){
		return e.getCost()+a.getCost()+10000+sc.getCost();
	}
}

class Warehouse{
	private ArrayList cars;
	public void add (Car car){
		cars.add(car);
	}

	public Warehouse(){
		cars = new ArrayList();
	}

	public double TotalCost(){
		double i = 0.0;
		for(Iterator iterator = cars.iterator();iterator.hasNext();){
			Car car = (Car)iterator.next();
			i = i + car.cost();
		}
		return i;
	}
	public double TotalPirce(){
		return TotalCost()*1.2;
	}
}

public class JPA06_5 {
	public static void main(String args[]) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File("D://wrongdata.txt"));
		}catch (FileNotFoundException e) {
			System.out.println("File not found!");
			System.exit(0);
		}
		Warehouse wh = new Warehouse();
		boolean si = true ;
		do{
			if(sc.hasNext()) {
				String s = sc.next();
				int i = sc.nextInt();
				String s1 = sc.next();
        		//利用switch-case來抓取錯誤的資料
				switch(s.charAt(0)){
					case 'B':
					wh.add(new BasicCar(i,s1));
					break;

					case 'S':
					wh.add(new SLuxCar(i,s1));
					break;

					case 'L':
					wh.add(new LuxCar(i,s1));
					break;

        			default://抓到錯誤便顯示出來，不加入倉庫中
        				System.out.println("Incorect input data : "+s+" "+i+" "+s1);
        		}
        	} else {
        		System.out.println("Total cost: " + wh.TotalCost());
        		System.out.println("Total price: " + wh.TotalPirce());
        		si = false;
        	}
    	}while(si);
	}
}
