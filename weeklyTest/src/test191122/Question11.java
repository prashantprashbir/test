package test191122;
class CallbyValue
{
	void product(String firstname,String lastname )
	{
		firstname="rahul";
		lastname="kumar";
		System.out.println(firstname);
		System.out.println(lastname);
	}
}

public class Question11 {

	public static void main(String[] args) {
		
		
		String firstname="vikas";
		String lastname="shah";
		System.out.println(firstname);
		System.out.println(lastname);
		CallbyValue o= new CallbyValue();
		o.product(firstname, lastname);
		

	}

}
