package test191122;
class Method
{
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println(res);
	}
	void addition(int x,int y,int z)
	{
		int res=(x+y+z);
		System.out.println(res);
	}
	void addition(int w,int x,int y,int z)
	{
		int res=(w+x+y+z);
		System.out.println(res);		
	}
}

public class Question9 {

	public static void main(String[] args) {
		Method o= new Method();
		o.addition(10, 10);
		o.addition(10, 10, 10);
		o.addition(10, 10, 10, 10);

	}

}
