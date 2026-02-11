package week2;

public class OddIndexUppercase {
	public static void main(String[] args) {
		String test = "hello";
		char[] charArray= test.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			if(i%2!=0) {
				charArray[i] = Character.toUpperCase(charArray[i]);
	}

}
		System.out.println(charArray);
}
	}