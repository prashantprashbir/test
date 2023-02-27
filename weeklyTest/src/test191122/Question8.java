package test191122;
class One
{
	static void division(int x,int y)
	{
		Two o=new Two();
		o.substraction(50, 25);
		
		int res=(x/y);
		System.out.println(res);
	}
	
}
class Two
{
	void substraction(int a,int b)
	{
		int res=(a-b);
		System.out.println(res);
	}
}

public class Question8 {

	public static void main(String[] args) {
		One.division(50, 25);
		

	}

}
