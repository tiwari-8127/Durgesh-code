package package1;

public class student {
	int rollNo;
	int age;
	
	public void display1()
	{
		System.out.println("welcome to all off you");
		
	}
public void display2()
{
	System.out.println("Automation is very easy");
	
}

public static void main(String[] args) {
	student s1=new student();
	s1.age= 17;
	s1.rollNo= 12345;
	s1.display1();
	s1.display2();
	System.out.println("age is :"+ s1.age+ "\nrollnumberis :" + s1.rollNo);
	
	
}
	
}