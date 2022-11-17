package package1;

public class Constr4 {
	
public Constr4() {
	this(1,2,3);
	
	
	System.out.println("Default parameterized");
	}
public Constr4(int a) {
	this(1,2,3,4);
	
	System.out.println("one parameterized ");

	
}
public Constr4(int a,int b) {
	this(1);
	
	System.out.println("two parameterized method");
}
public Constr4(int a, int b, int c) {
	System.out.println("three parameterized method");
}
public Constr4(int a, int b, int c, int d) {
	this();
	System.out.println("four parameterized method");
}
public static void main(String[] args) {
	Constr4 ob=new Constr4(1,2);


}
}
