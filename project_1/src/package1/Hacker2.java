package package1;

public class Hacker2 extends Hacker1
{
public Hacker2()
{
	this(1,2);

	System.out.println("child deafult parameterized method");
}
public Hacker2(int a) {
	this();
	System.out.println("child one parameterized method");
}
public Hacker2(int a, int b) {
	super(1,2);
	System.out.println("child two [parameterized method");
}
public Hacker2(int a, int b, int c) {
	this(1);
	System.out.println("child three parameterized method");
}

public static void main(String[] args) {
	Hacker2 ob=new Hacker2(1,2,3);
}
}
