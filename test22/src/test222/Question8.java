package test222;
interface One
{
	void addition(int x,int y);
}

interface Two extends One
{
	
	void sub(int a,int b);
}

interface Three extends Two
{
	
	void multi(int m,int n);
}
class Four implements Three
{
	public void multi(int m,int n)
	{
		int res=(m*n);
		System.out.println(res);
	}
	public void addition(int x,int y)
	{
		int res =(x+y);
		System.out.println(res);
	}
	public void sub(int a,int b)
	{
		int res=(a-b);
		System.out.println(res);
	}
}

public class Question8 {

	public static void main(String[] args) {
		
			Four obj= new Four();
			obj.addition(10, 10);
			obj.sub(20, 10);
			obj.multi(22, 22);
	}

}
