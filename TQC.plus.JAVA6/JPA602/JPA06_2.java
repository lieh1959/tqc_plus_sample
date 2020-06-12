/* TQC+ JAVA6 - 602_2 */

class Unit{
	int cost;
	Unit(){
		cost = 0;
	}
	public int getcost(){
		return cost;
	}
}

class LCD extends Unit{
	LCD(int i){
		if(i==10)
			cost=2000;
		else if(i==15)
			cost=2500;
		else
			cost=3000;
	}
}

class CPU extends Unit{
	CPU(double d ){
		if(d==1.66)
			cost=6000;
		if(d==2.2)
			cost=8000;
		if(d==2.4)
			cost=11000;
	}
}

class HD extends Unit{
	HD(String s){
		if(s=="120G")
			cost = 2400;
		else
			cost = 2800;
	}
}

//�إߤ��Ϊ���k�A�H���~��
abstract class PCandMultiPC{
	double  cost;
	CPU l;
	HD c;
	PCandMultiPC() {
		l = new CPU(2.4);
		c = new HD("160G");
	}
	abstract public double getCost();
	abstract public double getPrice();
}

class PC extends PCandMultiPC{
	public double getCost(){
		return (l.getcost()+c.getcost()+500);
	}

	public double getPrice(){
	   	return (l.getcost()+c.getcost())*1.8;
	}
}

class MultiPC extends PCandMultiPC{
	double toa;
	MultiPC(int a,int b) {
		toa = a*l.getcost()+b*c.getcost();
	}

	public double getCost(){
	    return (toa*1.2);
	}
		public double getPrice(){
			return (toa*1.8);
		}
}


class JPA06_2 {
	public static void main(String args[]){
		PC pc = new PC();
		System.out.println("PC cost:"+pc.getCost()+", price:"+pc.getPrice());
		MultiPC multipc1 = new MultiPC(2, 4);
		System.out.println("MultiPC: 2CPU, 4HD, cost:"+multipc1.getCost()+", price:"+multipc1.getPrice());
		MultiPC multipc2 = new MultiPC(4, 8);
		System.out.println("MultiPC: 4CPU, 8HD, cost:"+multipc2.getCost()+", price:"+multipc2.getPrice());
	}
}