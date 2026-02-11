package week2;
public class Library {
	public String addBook(String bookTitle)
	{
		return bookTitle;
	}
	public void issueBook() {
		System.out.println("Book issued successfully");

}

public static void main(String[] args)
{
	Library book = new Library();
	String addBook = book.addBook("Story Book");
	System.out.println(addBook);
	book.issueBook();

}
}
