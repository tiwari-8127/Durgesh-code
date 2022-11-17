package package1;

public class Durgesh_2  //  (((((10*2)+2)-2)-2)/2=9
{
public int mul(int x, int y)
{
	int mul=x*y;

return mul;

}
public int sum(int x, int y)
{int sum=x+y;
return sum;

}
public int sub(int x,int y)
{
	int sub=(x-y);
	return sub;
			
}

public int div(int x, int y)
{
int div=x/y;
return div;
}
public static void main(String[] args) {
	Durgesh_2 D1=new Durgesh_2();
	int res1=D1.mul(10,2);
    int res2=D1.sum(res1,2);
    int res3=D1.sub(res2,2);
    int res4=D1.sub(res3,2);
    int res5=D1.div(res4,2);
    System.out.println("((((10*2)+2)-2)-2)/2)="+res5);
    
    
    
   

    
    
    
    
    
}
}
