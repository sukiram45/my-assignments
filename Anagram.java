package week2;

public class Anagram {
public static void main(String[] args) {
	String s1 = "listen";
    String s2 = "silent";

    if (s1.length() != s2.length()) {
        System.out.println("Not Anagram");
    } else {
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);

        if (String.valueOf(a).equals(String.valueOf(b)))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }

	}

}
