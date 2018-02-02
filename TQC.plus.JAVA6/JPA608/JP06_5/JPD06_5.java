package JPA608.JP06_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

abstract class Food{
	int amount;
	int calorie;
	int unitCost;
	
	Food(int i){amount=i;}
	void setCaloriePerGram(int i){calorie=i;}
	void setUnitCost(int i){unitCost=i;}

	int getCost(){return unitCost*amount;}
	int getAmount(){return amount;}
	
	abstract int getCalorie();
}

class Rice extends Food{
	Rice(int i)
	{super(i);calorie=1;unitCost=1;}
	int getCalorie(){return getAmount()*calorie;}
}

class Egg extends Food{
	Egg(int i)
	{super(i);calorie=2;unitCost=2;}
	int getCalorie(){return getAmount()*calorie;}
}

class Cabbage extends Food{
	Cabbage(int i)
	{super(i);calorie=1;unitCost=3;}
	int getCalorie(){return getAmount()*calorie;}
}

class PorkRib extends Food{
	PorkRib(int i)
	{super(i);calorie=10;unitCost=8;}
	int getCalorie(){return getAmount()*calorie;}
}

class Carrot extends Food{
	Carrot(int i)
	{super(i);calorie=1;unitCost=3;}
	int getCalorie(){return getAmount()*calorie;}
}

class LunchBox{
	int calorie;
	Vector content;
	LunchBox(){content=new Vector();}
	double priceRatio;
	void setPriceRatio(double d){priceRatio=d;}
	
	String isCheaperThan(LunchBox lb)
	{
		if(getPrice()<lb.getPrice())
			return "YES";
		else
			return "NO";
	}
	double getPrice(){
		double i =0;
		for(Iterator iterator = content.iterator();iterator.hasNext();)
		{Food f = (Food)iterator.next();i+=f.getCost()*priceRatio;	}
		return i;}
	int getCost(){
		int i =0;
		for(Iterator iterator = content.iterator();iterator.hasNext();)
		{Food f = (Food)iterator.next();i+=f.getCost();	}
		return i;}
	
	
	void add(Food f)
	{content.add(f);}

	int getCalorie()
	{
		int i =0;
		for(Iterator iterator = content.iterator();iterator.hasNext();)
		{
			Food f = (Food)iterator.next();
			i+=f.getCalorie();
		}
			return i;
	}
}
//建立銷售報告類別
class SaleReport{
	ArrayList ss;
	int mun=0;
	//建構子初始化為ArrayList
	SaleReport()
	{ss=new ArrayList();}
	
	//將便當盒加入至陣列中
	void add(LunchBox ff)
	{
		ss.add(ff);
		mun++;//每增加一次，便當盒數量會+1
	}
	//建立取得數量的方法
	int getNumberOfLunchBox()
	{return mun;}
	//建立取得利潤的方法
	int getProfit(){
		int i =0;
		for(Iterator iterator = ss.iterator();iterator.hasNext();)
		{
			LunchBox lbb = (LunchBox)iterator.next();
			i+=lbb.getPrice()-lbb.getCost();
		}
			return i;
	}
}



class JPD06_5
{
    public static void main(String args[])
    {
        LunchBox economy = new LunchBox();
        economy.add(new Rice(200));
        economy.add(new Cabbage(100));
        economy.add(new PorkRib(250));
        economy.setPriceRatio(1.2);
        
        LunchBox valuedChoice = new LunchBox();
        valuedChoice.add(new Rice(200));
        valuedChoice.add(new Egg(30));
        valuedChoice.add(new Carrot(100));
        valuedChoice.add(new PorkRib(300));
        valuedChoice.setPriceRatio(1.3);
        
        SaleReport sr = new SaleReport();
        sr.add(economy);
        sr.add(valuedChoice);
        System.out.println( sr.getNumberOfLunchBox() + " lunch boxes have been sold.");
        System.out.println("Profit is " + sr.getProfit() + ".");
        
    }
}