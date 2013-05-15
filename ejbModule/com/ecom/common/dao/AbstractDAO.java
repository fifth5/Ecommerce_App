package com.ecom.common.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractDAO {

	@PersistenceContext(unitName="ecommerce")
	protected EntityManager em;
}
