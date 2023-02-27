package test191122;
class Parameter
{
	String firstname;
	String lastname;
	Parameter(String fname,String laname)
	{
		firstname=fname;
		lastname=laname;
		System.out.println("firstname is "+firstname);
		System.out.println("last name is "+lastname);
	}
}

public class Question3 {

	public static void main(String[] args) {
		
		Parameter o= new Parameter("vikas","kumar");
		

	}

}
