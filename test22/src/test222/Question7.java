package test222;
class Program1
{
	Program1(String name)
	{
		System.out.println(name);
	}
}

class Program2 extends Program1
{
	Program2(String name)
	{
		super(name);
	}
	void showLastname(String lastname)
	{
		System.out.println(lastname);
	}
}

class Program3 extends Program2
{
	Program3(String name)
	{
		super(name);
	}
}

public class Question7 {

	public static void main(String[] args) {
		
		
		Program3 obj= new Program3("santosh");
		obj.showLastname("kumar");
		
	}

}
