package JPA607.JP06_2;

class NB{
	int cost;
	NB(int i){if(i==1)cost=5000;else cost=8500;}
	int getCost(){return cost;}
}
//�إ�CPU���O
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

	//�غc�l��l�ơA�ǤJNB���ũMCPU����
    CNB(int i,String s)
    {
	b=new NB(i);
	c=new CPU(s);
    }
    //�إߦ�����k
    abstract double cost();
    //�إ߻�����k
    double price(){
	return cost()*1.5;
	
}

}
//�~��CNB
class BasicNB extends CNB{
	BasicNB(int i ,String s)
	{super(i,s);}
	double cost()
	{return b.getCost()+c.getCost()+1000;}
}
//�~��CNB
class LuxNB extends CNB{
	LuxNB(int i ,String s)
	{super(i,s);}
	double cost()
	{return b.getCost()+c.getCost()+2000;}
	
}

public class JPD06_2 {
    public static void main(String args[]){

        BasicNB bc = new BasicNB(1,"basic");
        System.out.println("�ӥιq������: " + bc.cost());
        System.out.println("�ӥιq�����: " + bc.price());
    
        LuxNB lc = new LuxNB(2,"Lux");
        System.out.println("�������֤߹q������: " + lc.cost());
        System.out.println("�������֤߹q�����: " + lc.price());
    }
}