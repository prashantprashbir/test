package test222;
interface Method1
{
	abstract void multiplication(int x,int y);
}
class Method2 implements Method1
{
	public void multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println(res);
	}
}

public class Question4 {

	public static void main(String[] args) {
		
		Method2 obj= new Method2();
		obj.multiplication(10, 10);
	}

}
