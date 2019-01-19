package inheritanceTablePerClass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ChildClass2")
public class BookDb2 extends IBookDb {

}
