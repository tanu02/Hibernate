package inheritanceTablePerClass;

public class App {
	public static void main(String[] args) {
		SessionWrapper.openSession();
		SessionWrapper.beginTransaction();

		BookDb2 book = new BookDb2();
		setParameters(book, 1, "Goblets of Fire");
		
		BookDb1 book1 = new BookDb1();
		setParameters(book1, 1, "Deathly Hallows");

		SessionWrapper.saveSession(book);
		SessionWrapper.saveSession(book1);
		SessionWrapper.commitSession();
		SessionWrapper.closeSession();

	}

	static void setParameters(IBookDb book, int id, String bookName) {
		book.setBookid(id);
		book.setBookName(bookName);
		book.setQuantity(1);
	}

}
