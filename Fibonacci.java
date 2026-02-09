package week2;

public class Fibonacci {
public static void main(String[] args) {
		int n=8;
		int a=0;
		int b=1;
		int c=a+b;
		System.out.println(a);
		System.out.println(b);
		for(int i=3;i<=n;i++)
		{
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
				

	}

}
