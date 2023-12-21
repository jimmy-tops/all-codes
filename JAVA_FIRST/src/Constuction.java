
class Box
{
	double width,height,depth;
	Box()
	{
		System.out.println("Default constuctor called");
		width=3;
		height=4;
		depth=5;
	}
	Box(double w,double h,double d)
	{
		System.out.println("parameterrised constuctore");
		width=w;
		height=h;
		depth=d;
	}
	void volume()
	{
		System.out.println("volume of box:"+(width*height*depth));
	}
	
}

public class Constuction {
	
	public static void main(String[] args) {
		Box b1=new Box();
		b1.volume();
		Box b2=new Box(4,5,6);
		b2.volume();
		System.out.println("End of main method");
	}

}
