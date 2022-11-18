package Entity;

import Entity.Category;
import Entity.Orders;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-11-18T13:27:32", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Garments.class)
public class Garments_ { 

    public static volatile SingularAttribute<Garments, Integer> garmentid;
    public static volatile SingularAttribute<Garments, Integer> price;
    public static volatile CollectionAttribute<Garments, Orders> ordersCollection;
    public static volatile SingularAttribute<Garments, Integer> stock;
    public static volatile SingularAttribute<Garments, Category> categoryid;

}