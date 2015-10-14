package org.jboss.as.quickstarts.bean_validation_custom_constraint;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PersonAddress.class)
public abstract class PersonAddress_ {

	public static volatile SingularAttribute<PersonAddress, String> country;
	public static volatile SingularAttribute<PersonAddress, String> streetAddress;
	public static volatile SingularAttribute<PersonAddress, String> city;
	public static volatile SingularAttribute<PersonAddress, Person> person;
	public static volatile SingularAttribute<PersonAddress, String> pinCode;
	public static volatile SingularAttribute<PersonAddress, String> locality;
	public static volatile SingularAttribute<PersonAddress, Long> personId;
	public static volatile SingularAttribute<PersonAddress, String> state;

}

