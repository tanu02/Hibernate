package inheritanceSingleTable;

public class App {
	public static void main(String[] args) {
		SessionWrapper.openSession();
		SessionWrapper.beginTransaction();

		BookDb2 book = new BookDb2();
		setParameters(book, 1);

		BookDb1 book1 = new BookDb1();
		setParameters(book1, 2);

		SessionWrapper.saveSession(book);
		SessionWrapper.saveSession(book1);
		SessionWrapper.commitSession();
		SessionWrapper.closeSession();

	}

	static void setParameters(IBookDb book, int id) {
		book.setBookid(id);
		book.setBookName("Harry Potter");
		book.setQuantity(1);
	}

}
