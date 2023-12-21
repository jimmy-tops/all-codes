

abstract class RBI
{
	abstract void roi(double r);
	}
class SBI extends RBI
{
	void roi(double r) {
		System.out.println("rate of Intresrt given by Sbi :"+r);
	}
}

class ICICI extends RBI
{
	void roi(double i) {
		System.out.println("rate of Intresrt given by ICICI :"+i);
	}
}

class HDFC extends RBI
{
	void roi(double r) {
		System.out.println("rate of Intresrt given by HDFC :"+r);
	}
}

public class AbstractDemo {
	
	public static void main(String[] args) {
		SBI s=new SBI();
		ICICI i=new ICICI();
		HDFC h=new HDFC();
		
		s.roi(4.6);
		i.roi(6.3);
		h.roi(6.7);
		
	}

}
