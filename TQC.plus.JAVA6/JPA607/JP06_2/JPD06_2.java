package JPA607.JP06_2;

class NB{
	int cost;
	NB(int i){if(i==1)cost=5000;else cost=8500;}
	int getCost(){return cost;}
}
//建立CPU類別
class CPU{
	int cost;
	CPU(String s)
	{
		if(s.equals("basic"))
			cost = 1000;
		else
			cost = 2000;
	}
	int getCost(){return cost;}
}

abstract class CNB{
	NB b;
	CPU c;

	//建構子初始化，傳入NB等級和CPU等級
    CNB(int i,String s)
    {
	b=new NB(i);
	c=new CPU(s);
    }
    //建立成本方法
    abstract double cost();
    //建立價錢方法
    double price(){
	return cost()*1.5;
	
}

}
//繼承CNB
class BasicNB extends CNB{
	BasicNB(int i ,String s)
	{super(i,s);}
	double cost()
	{return b.getCost()+c.getCost()+1000;}
}
//繼承CNB
class LuxNB extends CNB{
	LuxNB(int i ,String s)
	{super(i,s);}
	double cost()
	{return b.getCost()+c.getCost()+2000;}
	
}

public class JPD06_2 {
    public static void main(String args[]){

        BasicNB bc = new BasicNB(1,"basic");
        System.out.println("商用電腦成本: " + bc.cost());
        System.out.println("商用電腦售價: " + bc.price());
    
        LuxNB lc = new LuxNB(2,"Lux");
        System.out.println("高階雙核心電腦成本: " + lc.cost());
        System.out.println("高階雙核心電腦售價: " + lc.price());
    }
}