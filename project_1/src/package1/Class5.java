package package1;

public class Class5 {
	
		public Class5() {
			this(1,2,3);
		System.out.println(" Paraent Default parameterizd method");
	}
	
	
		public Class5(int a)
		{
			this();
		System.out.println("parent 1 class parameterized method");
	}
		
			public Class5(int a, int b) {
				this(1);
			System.out.println("parent 2 class parameterized method");
		}
			
				
		public Class5(int a, int b, int c)
{
			System.out.println("parent 3 class parameterized method");
			}
		public static void main(String[] args) {
			Class5 obj= new Class5(1,2);
		}
}

