package com.ecom.book.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.ecom.book.dao.PublisherDAO;
import com.ecom.book.dao.impl.PublisherDAOImpl;
import com.ecom.book.po.Publisher;
import com.ecom.book.service.PublisherService;
import com.ecom.util.SessionBeanUtil;

@Stateless
@Remote(PublisherService.class)
public class PublisherServiceImpl implements PublisherService{

	private PublisherDAO publisherDAO;
	
	{
		final String beanName=PublisherDAOImpl.class.getSimpleName();
		final String viewClassName=PublisherDAO.class.getName();
		publisherDAO=(PublisherDAO)SessionBeanUtil.getBean(beanName, viewClassName);
	}
	
	public void createPublisher(Publisher publisher) {
		publisherDAO.createPublisher(publisher);
	}
	
	public void mergePublisher(Publisher publisher){
		publisherDAO.mergePublisher(publisher);
	}
	
	public void deletePublisher(String publisherId) {
		publisherDAO.deletePublisher(publisherId);
	}
	
	public List<Publisher> loadPublisher() {
		List<Publisher> publisherList=new ArrayList<Publisher>();
		publisherList=publisherDAO.loadPublisher();
		return publisherList;
	}
}
