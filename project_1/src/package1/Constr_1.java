package package1;

public class Constr_1 {
	public Constr_1() {
	this(1,2,3,4);
	System.out.println("Default Constructor");
	}
	
	public Constr_1(int a) {
		this();
		System.out.println("one parameterized constructor");
		}
	public Constr_1(int a, int b) {
		this(1,2,3);
		System.out.println("two parameterized constructor");
		}
public Constr_1(int a, int b, int c) {
this(1);
	System.out.println("three parameterized method");
}

public Constr_1(int a, int b, int c,int d) {

	System.out.println("four parameterized method");
	}
public static void main(String[] args) {
	
	Constr_1 ab=new Constr_1(1,2);
}
}