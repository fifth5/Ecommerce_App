package com.ecom.book.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.ecom.book.dao.AuthorDAO;
import com.ecom.book.dao.impl.AuthorDAOImpl;
import com.ecom.book.po.Author;
import com.ecom.book.service.AuthorService;
import com.ecom.util.SessionBeanUtil;

/**
 * 
 * @author FIFTH
 * 		Author Service Imlplements Class
 *
 */
@Stateless
@Remote(AuthorService.class)
public class AuthorServiceImpl implements AuthorService {

	/**
	 * authorDAO
	 */
	private AuthorDAO authorDAO;
	
	{
		final String beanName = AuthorDAOImpl.class.getSimpleName();
		final String viewClassName = AuthorDAO.class.getName();
		authorDAO = (AuthorDAO)SessionBeanUtil.getBean(beanName, viewClassName);
	}
	
	/**
	 * query author list service
	 */
	@Override
	public List<Author> loadAuthor() {
		List<Author> authorList = new ArrayList<Author>();
		authorList = authorDAO.loadAuthor();
		return authorList;
	}

	/*
	 * (non-Javadoc)
	 * @see com.ecom.book.service.AuthorService#loadAuthor(int, int)
	 */
	@Override
	public List<Author> loadAuthor(int rowBegin, int rowCounts) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createAuthor(Author author) {
		authorDAO.createAuthor(author);
		
	}

	@Override
	public void updateAuthor(Author author) {
		authorDAO.updateAuthor(author);
		
	}

	@Override
	public boolean deleteAuthor(String authorId) {
		return authorDAO.deleteAuthor(authorId);	
	}

}
