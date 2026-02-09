package week2;

public class Palindrome {

	public static void main(String[] args) {
		int num=1221;
		int rev=0;
		int rem=0;
		int temp=num;
		for(;num > 0;num= num/10)
		{
			rem=num%10;
			rev=rev*10+rem;
		
		}
		if(temp==rev)
		{
			System.out.println("the given number is palindrome");
			
		}
		else
		{
			System.out.println("this is not palindrome");
		}
	}

}
