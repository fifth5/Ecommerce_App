package com.ecom.book.constants;

/**
 * 
 * @author FIFTH
 * 	the HQL String of Author module
 *
 */
public class AuthorConstants {
	
	/**
	 * load authors list hql
	 */
	public static final String LOAD_AUTHOR = "select author from Author author order by author.authorName ";
	
	/**
	 * delete the author
	 */
	public static final String DELETE_AUTHOR = "delete from Author author where author.authorId = ?1";

}
