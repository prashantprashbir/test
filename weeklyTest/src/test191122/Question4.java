package test191122;
class Task1
{
	String vehiclename;
	int noofvehicles;
	Task1(String vhname,int vehicles)
	{
		vehiclename=vhname;
		noofvehicles=vehicles;
		System.out.println("name of vehicle "+vehiclename);
		System.out.println("no. of vehicles "+noofvehicles);
		
	}
	
}
class Task2
{
	void addition(int x,int y)
	{
		Task1 o= new Task1("honda",10);
		int res=(x+y);
		System.out.println(res);
	}
	
}

public class Question4 {

	public static void main(String[] args) {
		
		Task2 o2= new Task2();
		o2.addition(10, 10);
		

	}

}
