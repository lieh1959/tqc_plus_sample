/* TQC+ JAVA6 - 601_4 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Unit{
	int cost ;
	Unit(){cost = 0;}
	public int getCost(){
		return cost;
	}
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
//建立一個倉庫的方法
class Warehouse{
	private ArrayList cars;
	//建立一個加入ArrayList的方法
	public void add (Car car){
		cars.add(car);
	}
	//建構子，初始化ArrayList
	public Warehouse(){
		cars = new ArrayList();
	}

	public double TotalCost(){
		double i = 0.0;
		//在List和Map系列裡面，都會有Iterator可搭配使用，檢視是否有下一個物件
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
public class JPA06_4 {
	public static void main(String args[]) {
		Scanner sc = null;
        //使用try-catch來抓取讀檔失敗的Exception
		try {
        	  //檔案位置，請自行放置
			sc = new Scanner(new File("D:\\data.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
              System.exit(0);//讀檔失敗便關閉
          }
        Warehouse wh = new Warehouse();
        boolean si = true ;
        //使用一個do-while檢視，是否可以繼續執行下去
        do{
          	if(sc.hasNext()) {
          		String s = sc.next();
          		int i = sc.nextInt();
          		String s1 = sc.next();

          		if(s.charAt(0)=='B')
        		//產生一個物件，並加入ArrayList中
          			wh.add(new BasicCar(i,s1));
          		if(s.charAt(0)=='S')
          			wh.add(new SLuxCar(i,s1));
          		if(s.charAt(0)=='L')
          			wh.add(new LuxCar(i,s1));
          	} else {
        		//如果讀取不到下一行資料，則進到這邊
          		System.out.println("Total cost: "+(int)wh.TotalCost());
          		System.out.println("Total cost: "+wh.TotalPirce());
        		//結束do-while的動作
          		si=false;
          	}
        } while(si);
    }
}