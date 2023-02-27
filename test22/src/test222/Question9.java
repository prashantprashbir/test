package test222;
interface Demo1
{
	void showName(String name);
}

interface Demo2 
{
	void showLastname(String lastname);
}


class Demo4 implements Demo2,Demo1
{

	
	public void showLastname(String lastname)
	{
		System.out.println(lastname);
		
	}

	
	public void showName(String name) 
	{
		
		System.out.println(name);
	}

	
	
	
}

public class Question9 {

	public static void main(String[] args) {
	
			Demo4 obj= new Demo4();
			obj.showName("vikas");
			obj.showLastname("kumar");
			
	}

}
