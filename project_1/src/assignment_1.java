public class assignment_1  /// (10+2)(10-2)
{
	public int sum(int a,int b)
	{
	int c;
	c=a+b;
	System.out.println("sum result" +c);
	return c;
	}
	
	public int sub(int x1,int x2)
	{
	int x3;
	x3=x1-x2;
	System.out.println("sub result" +x3);
	return x3;
	}
	
	public void multi(int a1,int a2)
	{
		int result;
		result=a1*a2;
		System.out.println("final result "+result);
		}
	public static void main(String[] args)
	{
		assignment_1 ob=new assignment_1();
		int sumresult=ob.sum(10,2);
		int subresult= ob.sub(12, 2);
		ob.multi(sumresult, subresult);
	}
}
	
	
	
	
