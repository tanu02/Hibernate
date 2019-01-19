package inheritanceTablePerClass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ChildClass1")
public class BookDb1 extends IBookDb {

}
