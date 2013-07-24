package com.ecom.book.dao;

import java.util.List;

import com.ecom.book.po.Author;

/**
 * 
 * @author FIFTH
 * 		the Author DAO Interface
 *
 */
public interface AuthorDAO {
	
	/**
	 * 
	 * @return list of queried authors
	 */
	public List<Author> loadAuthor();
	
	/**
	 * 
	 * @param rowBegin 
	 * 		the begin index of the list
	 * @param rowCounts 
	 * 		the counts of every page
	 * @return 
	 * 		list of queried authors
	 */
	public List<Author> loadAuthor(int rowBegin, int rowCounts);
	
	/**
	 * 
	 * @param author 
	 * 		the author to be created
	 * @return
	 * 		true:create success
	 * 		false:create failed 
	 */
	public boolean createAuthor(Author author);
	
	/**
	 * 
	 * @param author
	 * 		the author to be modified
	 * @return
	 * 		true: success
	 * 		false: failed
	 */
	public boolean updateAuthor(Author author);
	
	/**
	 * 
	 * @param author
	 * 		the author to be deleted
	 * @return
	 * 		true: success
	 * 		false: failed
	 */
	public boolean deleteAuthor(String authorId);

}
