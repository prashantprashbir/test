package test191122;
class Chaining
{
	Chaining(String firstname)
	{
		System.out.println(firstname);
	}
	Chaining(String lastname,String middlename)
	{
		this("rahul");
		System.out.println(lastname);
		System.out.println(middlename);
	}
	Chaining(int marks,String subject)
	{
		this("kumar","g");
		System.out.println(marks);
		System.out.println(subject);
	}
}

public class Question1 {

	public static void main(String[] args) {
		
		Chaining o= new Chaining(10,"biology");
		

	}

}
