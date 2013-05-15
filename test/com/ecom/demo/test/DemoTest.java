package com.ecom.demo.test;

import java.util.Date;
import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Before;
import org.junit.Test;

import com.ecom.demo.bo.Demo;
import com.ecom.demo.dao.DemoDAO;
import com.ecom.demo.dao.impl.DemoDAOImpl;
import com.ecom.demo.service.DemoService;
import com.ecom.demo.service.impl.DemoServiceImpl;
import com.ecom.util.SessionBeanUtil;

public class DemoTest {

	private Hashtable<String,String> jndiProperties = new Hashtable<String,String>();
	private InitialContext ctx;
	private DemoDAO demoDAO;

//	@Before()
//	public void setProps() throws NamingException {
//		
//        jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
//        ctx = new InitialContext(jndiProperties);
//		
//		final String appName="";
//		final String moduleName="Ecommerce_App";
//		final String distinctName="";
//		final String beanName=DemoDAOImpl.class.getName();
//		final String viewClassName=DemoDAO.class.getName();
//		demoDAO=(DemoDAO)ctx.lookup("ejb:" + appName + "/" + moduleName + "/" + distinctName + "/"+beanName+"!"+viewClassName);
//	}
	
	@Test
	public void testInsert(){
		Demo demo=new Demo();
		demo.setDemoId(2);
		demo.setName("test");
		demo.setDescription("test demo");
		demo.setDate(new Date());
		
		demoDAO.insertDemo(demo);
	}
	
	@Test
	public void testService(){
		DemoService service=(DemoService)SessionBeanUtil.getBean(DemoServiceImpl.class.getSimpleName(), DemoService.class.getName());
		Demo demo=new Demo();
		demo.setDemoId(2);
		demo.setName("test");
		demo.setDescription("test demo");
		demo.setDate(new Date());
		service.insertDemo(demo);
	}
	
	@Test
	public void testDemoList(){
		DemoService service=(DemoService)SessionBeanUtil.getBean(DemoServiceImpl.class.getSimpleName(), DemoService.class.getName());
		List<Demo> demoList=service.getDemoList();
		for(Demo demo:demoList){
			System.out.println(demo.getName()+", "+demo.getDescription());
		}
	}
	
}
