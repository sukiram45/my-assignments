package week2;

public class LibraryManagment {

	public static void main(String[] args) {
		Library lib = new Library();
		String addbook = lib.addBook("GK Book");
		System.out.println(addbook);
		lib.issueBook();

	}

}
