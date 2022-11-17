package package1;

public class Constr_3 {
	public Constr_3() {
	this(11,22,33,44);
		
		
		System.out.println("default parameterized");
	}
	
	public Constr_3(int a,int b) {
	

	this(1,2,3);
	System.out.println("two parameterized method");
	}
	
	public Constr_3(int a) {
	
		this();
		
System.out.println("one parameterized");
	}
	
	public Constr_3(int a, int b, int c)
	
	{
		this(33);
		
		
		System.out.println("three parameterized");
	}
	
    public Constr_3(int a, int b, int c, int d)
    {
    
    	
    	
    	
    	System.out.println("four parameterized");
    }
	public static void main(String[] args) {
		Constr_3 ab1=new Constr_3(1,2);
		
		

		
		
		
		
    

	
	
	
	
	}
			
}
