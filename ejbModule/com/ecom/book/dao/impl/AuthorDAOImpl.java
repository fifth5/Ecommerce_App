package com.ecom.book.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ecom.book.constants.AuthorConstants;
import com.ecom.book.dao.AuthorDAO;
import com.ecom.book.po.Author;

/**
 * 
 * @author FIFTH
 * 	the Author DAO Class
 *
 */
@Stateless
@Local(AuthorDAO.class)
public class AuthorDAOImpl implements AuthorDAO {
	
	/**
	 * EntityManager em
	 */
	@PersistenceContext(unitName="ecommerce")
	protected EntityManager em;

	/**
	 * query the author list
	 */
	@Override 
	public List<Author> loadAuthor() {
		List<Author> authorList = new ArrayList<Author>();
		
		Query query = em.createQuery(AuthorConstants.LOAD_AUTHOR);
		authorList = query.getResultList();
		
		return authorList;
	}

	/**
	 * query the author list  based on rowBegin  & rowCounts
	 */
	@Override
	public List<Author> loadAuthor(int rowBegin, int rowCounts) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 *  create a author record into database
	 */
	@Override
	public boolean createAuthor(Author author) {
		
		em.persist(author);
		
		return false;
	}

	/**
	 * update the choosed author
	 */
	@Override
	public boolean updateAuthor(Author author) {
		em.merge(author);
		return false;
	}

	/**
	 * delete the choosed author
	 */
	@Override
	public boolean deleteAuthor(String authorId) {
		
		Query query = em.createQuery(AuthorConstants.DELETE_AUTHOR);
		query.setParameter(1, authorId);
	
		return query.executeUpdate()>0;
	}

}
