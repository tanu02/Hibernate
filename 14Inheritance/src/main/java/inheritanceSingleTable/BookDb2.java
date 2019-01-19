package inheritanceSingleTable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ChildClass2")
@DiscriminatorValue("ChildClass2")
public class BookDb2 extends IBookDb {

}
