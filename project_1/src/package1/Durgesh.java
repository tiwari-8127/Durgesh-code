package package1;

public class Durgesh {
	public Durgesh() {
		this(1);
		System.out.println("Deafult meth");
		
	}
public Durgesh(int a)
{
	this(1,3);
	
	System.out.println("one para meth");
}
public Durgesh(int a,int b)
{
	this(1,2,3);
	
	System.out.println("two para meth");
}
public Durgesh(int a,int b,int c)
{
	this(1,2,3,4);
	System.out.println("three para meth");
}
public Durgesh(int a, int b, int c,int d) {
	System.out.println("four para meth");
}
	public static void main(String[] args) {
		Durgesh ob= new Durgesh();
	}
}
