package package1;

public class Durgesh_3  // ((((((10+2)+2)-2)*2)/2)
 {
	public int sum(int x, int y)
	{
		int sum=x+y;
		return sum;
		}

	public int sub(int x, int y)
	{
		int sub=x-y;
	
	return sub;
	}
	
	public int mul(int x ,int y)
	{
		int mul=x*y;
		return mul;
		}

	public int div(int x, int y)
	{
		int div=x/y;
	
	return div;
	}
	
	public static void main(String[] args) {
		Durgesh_3 ab=new Durgesh_3();
		int res1=ab.sum(10,2);
		int res2=ab.sum(res1, 2);
		int res3=ab.sub(res2, 2);
		int res4=ab.mul(res3,2);
		int res5=ab.div(res4,2);
		System.out.println("((((((10+2)+2)-2)*2)/2)=" + res5);
	}
		
		
		
		
	}
	
