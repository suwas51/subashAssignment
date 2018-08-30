package com.jpa.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	static EntityManagerFactory managerFactory;

	public static EntityManagerFactory getEntityFactory() {
		if (managerFactory == null) {
			return managerFactory = Persistence.createEntityManagerFactory("Persistence");
		}
		return managerFactory;
	}
}
