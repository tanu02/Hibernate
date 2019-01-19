package inheritanceTablePerClass;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
@Table(name = "ParentClass")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class IBookDb {

	@Id
	int bookid;

	@Column(name = "Quantity")
	int quantity;

	@Column(name = "Book_Name")
	String bookName;

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

}
