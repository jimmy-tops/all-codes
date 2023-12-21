
class Student 
{
	int rno;
	String sname;
	
	public Student() {
		System.out.println("Default constuctore ");
	}
	
	Student(int rno,String sname){
		this();
         System.out.println("parametrerised constuuctroe");
         this.rno=rno;
         this.sname=sname;
	}
	void show(Student s)
	{
		System.out.println("Roll NO"+s.rno);
		System.out.println("student Name: "+s.sname);
	}
	void display()
	{
		
	}
	 
}

public class ThisDemo{
	
	public static void main(String[] args) {
		//Student s1=new Student();
		Student s1=new Student(1,"jigar");
		s1.display();
	}
}