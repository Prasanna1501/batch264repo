package javaprograms;

public class PrimeorNot {

	public static void main(String[] args) 
	{
		int n=10;
		boolean flag= false;
		for(int i=2;i<=n/2;++i)
		{
		if(n%i==0)
		{
			flag=true;
			System.out.print("Not Prime");
			break;
		}
		else
		{
			System.out.println("Prime Number");
			break;
		}
		}
		
		

	}

}
