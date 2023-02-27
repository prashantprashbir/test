package test222;
abstract class Memo
{
	static String name;
	static
	{
		String lastname="kumar";
		System.out.println(lastname);
		
	}
}


public class Question6 {

	public static void main(String[] args) {
		
		Memo.name="vikass";
		System.out.println(Memo.name);
		

	}

}
