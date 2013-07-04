package com.ecom.book.service;

import java.util.List;

import com.ecom.book.po.Publisher;

public interface PublisherService {

	public void createPublisher(Publisher publisher);
	
	public void mergePublisher(Publisher publisher);

	public void deletePublisher(String publisherId);

	public List<Publisher> loadPublisher();
}
