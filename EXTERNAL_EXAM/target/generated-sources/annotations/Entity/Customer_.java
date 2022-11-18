package Entity;

import Entity.Orders;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-11-18T13:27:32", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> city;
    public static volatile SingularAttribute<Customer, Integer> customerid;
    public static volatile SingularAttribute<Customer, Long> mobile;
    public static volatile CollectionAttribute<Customer, Orders> ordersCollection;
    public static volatile SingularAttribute<Customer, String> customerName;

}