package test222;
abstract class Maths1
{
	static int Count;
	static void addition()
	{
		int x,y;
		x=10;
		y=20;
		int result=(x+y);
		System.out.println(result);
		System.out.println(Count);
		
	}
}


public class Question5 {

	public static void main(String[] args) {
		
			Maths1.Count=2355;
			
			Maths1.addition();
	}

}
