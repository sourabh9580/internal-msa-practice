package Entity;

import Entity.Customer;
import Entity.Garments;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-11-18T13:27:32", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile SingularAttribute<Orders, Date> date;
    public static volatile SingularAttribute<Orders, Integer> orderid;
    public static volatile SingularAttribute<Orders, Garments> garmentid;
    public static volatile SingularAttribute<Orders, Customer> customerid;

}