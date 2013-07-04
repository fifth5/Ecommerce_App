package com.ecom.book.dao;

import java.util.List;

import com.ecom.book.po.Publisher;

public interface PublisherDAO {
	
	public List<Publisher> loadPublisher();

	public void createPublisher(Publisher publisher);
	
	public void mergePublisher(Publisher publisher);

	public void deletePublisher(String publisherId);
}
