package package1;

public class School5 extends Class5 {
	public School5()
	{
	this(1,2);	
		System.out.println("child deafault parameterized method");
	}
	public School5(int a)
	{
	super(1,2);	
		System.out.println("child 1 parameterized method");
	}
	public School5(int a,int b) {
		this(1,2,3);
	
		System.out.println("child 2 parameterized method");
		
	}
	public School5(int a,int b, int c) 
	{
	this(1);	
		System.out.println("child 3 parameterized method");
	}
	public static void main(String[] args) {
		School5 ob=new School5();
	}
}

