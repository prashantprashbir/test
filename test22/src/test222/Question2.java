package test222;
abstract class A
{
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println(res);
	}
}
class B extends A
{
	
}

public class Question2 {

	public static void main(String[] args) {
		
		B obj= new B();
		obj.addition(10, 10);
	}

}
