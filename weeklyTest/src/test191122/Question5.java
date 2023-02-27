package test191122;
class Product55
{
	String firstname;
	String lastname;
	Product55()
	{
		Product55.division(10,5);
		firstname="santosh";
		lastname="kumar";
	    System.out.println("first name is "+firstname);
	    System.out.println("last name is "+lastname);
	    
	}
	{
		
		int x,y;
		x=10;
		y=20;
		int res=(x+y);
		System.out.println("instance method result is "+res);
	}
	static void division(int a,int b)
	{
		
		int res=(a/b);
		System.out.println("static method result is "+res);
	}
}

public class Question5 {

	public static void main(String[] args) {
		Product55 o=new Product55();
		

	}

}
