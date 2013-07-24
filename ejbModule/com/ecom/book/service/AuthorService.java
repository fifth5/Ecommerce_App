package com.ecom.book.service;

import java.util.List;

import com.ecom.book.po.Author;

/**
 * 
 * @author FIFTH
 *		the Author Service Interface
 */
public interface AuthorService {

	/**
	 * 
	 * @return
	 * 		the list of author;
	 */
	public List<Author> loadAuthor();
	
	public List<Author> loadAuthor(int rowBegin, int rowCounts);
	
	public void createAuthor(Author author);
	
	public void updateAuthor(Author author);
	
	public boolean deleteAuthor(String authorId);

}
