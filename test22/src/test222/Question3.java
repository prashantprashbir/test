package test222;
abstract class AA
{
	abstract void addition(int x,int y);
}
class BB extends AA
{
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println(res);
	}
}

public class Question3 {

	public static void main(String[] args) {
		
		BB obj= new BB();
		obj.addition(50, 50);
	}

}
