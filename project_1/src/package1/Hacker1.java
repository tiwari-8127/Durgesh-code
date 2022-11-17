package package1;

public class Hacker1 {
public Hacker1() {
	this(1,2,3);
	System.out.println("paraent deafault parameterized method");
}
public Hacker1(int a)
{
	this();
	System.out.println("parent one parameterized method");
}
public Hacker1(int a, int b) {
	this(1);
	System.out.println("parent two parameterized method");
}
public Hacker1(int a, int b, int c) {
	System.out.println("parent three parameterized method");
}
public static void main(String[] args) {
	Hacker1 ob=new Hacker1(1,2);
}
}
