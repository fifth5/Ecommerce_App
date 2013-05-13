package com.ecom.demo.dao.impl;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.Query;

import com.ecom.common.dao.AbstractDAO;
import com.ecom.demo.bo.Demo;
import com.ecom.demo.dao.DemoDAO;

@Stateless
@Local(DemoDAO.class)
public class DemoDAOImpl extends AbstractDAO implements DemoDAO {
	
	@Override
	public void insertDemo(Demo demo) {

		if(demo!=null){
			em.persist(demo);
		}
	}
	
	@Override
	public List<Demo> getDemoList() {
		List<Demo> rtnList=null;
		Query query=em.createQuery("Select demo from Demo demo order by demo.demoId");
		rtnList=query.getResultList();
		return rtnList;
	}
}
