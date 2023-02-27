package test222;
class Data1
{
	String address;
	void show1()
	{
		System.out.println("calss one "+address);
	}
}

class Data2 extends Data1
{
	String address;
	Data2(String address)
	{
		super.address=address;
	}
	void show2()
	{
		System.out.println("class two "+address);
	}
}

class Data3 extends Data2
{
	String address;
	Data3(String address)
	{
		super("Jaipur");
		super.address=address;
	}
	void show3()
	{
		System.out.println("class three "+address);
	}
}

public class Question10 {

	public static void main(String[] args) {
		
		Data3 obj= new Data3("8th main");
		obj.address=" main";
		obj.show1();
		obj.show2();
		obj.show3();

	}

}
