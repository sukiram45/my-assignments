package week2;

public class Prime {
public static void main(String[] args) {
		int n=16;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("it is not a prime number");
				System.exit(0);
			}
			
		}
            System.out.println("it is a prime number");
	}

}
