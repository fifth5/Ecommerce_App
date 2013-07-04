package com.ecom.book.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ecom.book.constants.PublisherConstants;
import com.ecom.book.dao.PublisherDAO;
import com.ecom.book.po.Publisher;

@Stateless
@Local(PublisherDAO.class)
public class PublisherDAOImpl implements PublisherDAO{

	@PersistenceContext(unitName="ecommerce")
	protected EntityManager em;
	
	public void createPublisher(Publisher publisher) {
		em.persist(publisher);
	}
	
	public void mergePublisher(Publisher publisher) {
		em.merge(publisher);
	}
	
	public void deletePublisher(String publisherId) {
		Query query=em.createQuery(PublisherConstants.DELETE_PUBLISHER);
		query.setParameter(1, publisherId);
		
		query.executeUpdate();
	};
	
	public List<Publisher> loadPublisher() {
		List<Publisher> publisherList=new ArrayList<Publisher>();
		
		Query query=em.createQuery(PublisherConstants.LOAD_PUBLISHER);
		publisherList=query.getResultList();
		
		return publisherList;
	};
}

