package test191122;
class Prime
{
	static  boolean getPrime(int num)
	{
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=flag+1;
				break;
			}
		}
		if(flag==0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}

public class Question10 {

	public static void main(String[] args) {
		
		boolean v1= Prime.getPrime(30);
		System.out.println(v1);
		
		

	}

}
