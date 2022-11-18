package Entity;

import Entity.Garments;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-11-18T13:27:32", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, String> categoryname;
    public static volatile CollectionAttribute<Category, Garments> garmentsCollection;
    public static volatile SingularAttribute<Category, Integer> categoryid;

}