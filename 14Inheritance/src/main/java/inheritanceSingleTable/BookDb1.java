package inheritanceSingleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ChildClass1")
@DiscriminatorValue("ChildClass1")
public class BookDb1 extends IBookDb {

}
