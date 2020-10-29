package com.cg.fms.utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connection {

	static EntityManagerFactory factory = null;

	public static EntityManagerFactory getFactory() {

		if (factory == null) {
			factory = Persistence.createEntityManagerFactory("Forest_BU");
		}
		return factory;
	}
}
