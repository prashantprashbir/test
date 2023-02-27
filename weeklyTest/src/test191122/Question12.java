package test191122;
class Twod
{
	void array(char arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class Question12 {

	public static void main(String[] args) {
		Twod o= new Twod();
			char arr[][]= {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
			
			o.array(arr);
			
	}

}
