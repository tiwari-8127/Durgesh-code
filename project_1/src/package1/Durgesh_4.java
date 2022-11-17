package package1;

public class Durgesh_4  //   (10*2)+2)-2)-2)/2=9
{
public int mul(int x, int y)
{
int z;
z=x+y;
System.out.println("mul result is" + z);
return z;
}
public int sum(int a, int b)
{
	int c;
	c=a+b;
	System.out.println("sum result is" + c);
    return c;
    }

public int sub(int d, int e)
{
	int f;
	f=d-e;
	System.out.println("sub result is" +f);
	return f;
	}
public int div(int m, int n)
{
	int o;
	o=m/n;
	System.out.println("div result is" +o);
	return o;
	}
public static void main(String[] args)
{
	Durgesh_4 ab=new Durgesh_4();
	int res1=ab.mul(10,2);
	int res2=ab.sum(res1,2);
	int res3=ab.sub(res2,2);
	int res4=ab.sub(res3,2);
	int res5=ab.div(res4,2);
	System.out.println("10*2)+2)-2)-2)/2)=" +res5);
	
	
}
	
	
}

