package test222;
class Hirarchy1
{
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println(res);
	}
}

class Hirarchy2 extends Hirarchy1
{
	void substraction(int a,int b)
	{
		int res=(a-b);
		System.out.println(res);
	}
}

class Hirarchy3 extends Hirarchy1
{
	void multi(int m,int n)
	{
		int res=(m*n);
		System.out.println(res);
	}
}

public class Question1 {

	public static void main(String[] args) {
		
		Hirarchy2 obj1= new Hirarchy2();
		obj1.substraction(22, 11);
		obj1.addition(10, 10);
		Hirarchy3 obj2= new Hirarchy3();
		obj2.multi(10, 10);
		obj2.addition(10, 20);
	}

}
