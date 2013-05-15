package com.ecom.demo.service.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.ecom.demo.bo.Demo;
import com.ecom.demo.dao.DemoDAO;
import com.ecom.demo.dao.impl.DemoDAOImpl;
import com.ecom.demo.service.DemoService;
import com.ecom.util.SessionBeanUtil;

@Stateless
@Remote(DemoService.class)
public class DemoServiceImpl implements DemoService{
	
	private DemoDAO demoDAO;

	{
		final String beanName=DemoDAOImpl.class.getSimpleName();
		final String viewClassName=DemoDAO.class.getName();
		demoDAO=(DemoDAO)SessionBeanUtil.getBean(beanName, viewClassName);
	}
	
	@Override
	public void insertDemo(Demo demo) {
		demoDAO.insertDemo(demo);
	}
	
	@Override
	public List<Demo> getDemoList() {
		return demoDAO.getDemoList();
	}
}
