/* TQC+ JAVA6 - 608_3 */

import java.util.Iterator;
import java.util.Vector;

abstract class Food{
	int amount;
	int calorie;
	//新增單位成本
	int unitCost;

	Food(int i){
		amount=i;
	}
	void setCaloriePerGram(int i){
		calorie=i;
	}
	//設定單位成本方法
	void setUnitCost(int i){
		unitCost=i;
	}

	//取得成本方法
	int getCost(){
		return unitCost*amount;
	}
	int getAmount(){
		return amount;
	}

	abstract int getCalorie();
}

class Rice extends Food{
	Rice(int i){//在子類別中設定好單位價錢
		super(i);
		calorie=1;
		unitCost=1;
	}
	int getCalorie(){
		return getAmount()*calorie;
	}
}

class Egg extends Food{
	Egg(int i){//在子類別中設定好單位價錢
		super(i);
		calorie=2;
		unitCost=2;}
	int getCalorie(){
		return getAmount()*calorie;
	}
}

class Cabbage extends Food{
	Cabbage(int i){//在子類別中設定好單位價錢
		super(i);
		calorie=1;
		unitCost=3;
	}
	int getCalorie(){
		return getAmount()*calorie;
	}
}

class PorkRib extends Food{
	PorkRib(int i){//在子類別中設定好單位價錢
		super(i);
		calorie=10;
		unitCost=8;}
	int getCalorie(){
		return getAmount()*calorie;
	}
}

class Carrot extends Food{
	Carrot(int i){
		super(i);
		calorie=1;
		unitCost=3;
	}
	int getCalorie(){
		return getAmount()*calorie;
	}
}

class LunchBox{
	int calorie;
	Vector content;
	LunchBox(){
		content=new Vector();
	}
	//新增一個變數，該變數乘以成本可以得到售價
	double priceRatio;
	void setPriceRatio(double d){
		priceRatio=d;
	}
	double getPrice(){
		double i =0;
		for(Iterator iterator = content.iterator();iterator.hasNext();){
			Food f = (Food)iterator.next();
			i+=f.getCost()*priceRatio;
		}
		return i;
	}


	void add(Food f){
		content.add(f);
	}

	int getCalorie(){
		int i =0;
		for(Iterator iterator = content.iterator();iterator.hasNext();){
			Food f = (Food)iterator.next();
			i+=f.getCalorie();
		}
			return i;
	}
}

class JPA06_3{
    public static void main(String args[]){
        LunchBox economy = new LunchBox();
        economy.add(new Rice(200));
        economy.add(new Cabbage(100));
        economy.add(new PorkRib(250));
        //設定變數值
        economy.setPriceRatio(1.2);
        System.out.println("Total calories of an economy lunch box are " + economy.getCalorie());
        System.out.println("The price of an economy lunch box is " + economy.getPrice());

        LunchBox valuedChoice = new LunchBox();
        valuedChoice.add(new Rice(200));
        valuedChoice.add(new Egg(30));
        valuedChoice.add(new Carrot(100));
        valuedChoice.add(new PorkRib(300));
        //設定變數值
        valuedChoice.setPriceRatio(1.3);
        System.out.println("Total calories of a valued-choice lunch box are " + valuedChoice.getCalorie());
        System.out.println("The price of a valued-choice lunch box is " + valuedChoice.getPrice());
    }
}
