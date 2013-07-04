package com.ecom.book.test;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.naming.InitialContext;

import org.junit.Test;

import com.ecom.book.dao.PublisherDAO;
import com.ecom.book.po.Publisher;
import com.ecom.book.service.PublisherService;
import com.ecom.book.service.impl.PublisherServiceImpl;
import com.ecom.util.SessionBeanUtil;

public class PublisherTest {

	private Hashtable<String,String> jndiProperties = new Hashtable<String,String>();
	private InitialContext ctx;
	
	private PublisherDAO publisherDAO;
	private PublisherService ps=(PublisherService)SessionBeanUtil.getBean(PublisherServiceImpl.class.getSimpleName(), PublisherService.class.getName());
	
	@Test
	public void testCreatePublisher(){
		Publisher publisher=new Publisher();
		publisher.setPublisherName("清华大学出版社");
		
		ps.createPublisher(publisher);
	}
	
	@Test
	public void testDeletePublisher(){
		String publisherId="2c9081bd3f86284f013f862cf2970003";
		ps.deletePublisher(publisherId);
	}
	
	@Test
	public void testLoadPublisher(){
		List<Publisher> publisherList=new ArrayList<Publisher>();
		publisherList=ps.loadPublisher();
		for(Publisher p:publisherList){
			System.out.println(p.getPublisherName()+", "+p.getPublisherInfo());
		}
	}
	
	@Test
	public void testMergePublisher(){
		Publisher publisher=new Publisher();
		publisher.setPublisherId("2c9081bd3fa99c47013fa9a02cc90006");
		publisher.setPublisherName("clare87v5");
		publisher.setPublisherInfo("asdasdasd");
		ps.mergePublisher(publisher);
	}
}
