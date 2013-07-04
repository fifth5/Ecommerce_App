package com.ecom.book.constants;

public class PublisherConstants {

	public static final String LOAD_PUBLISHER="select publisher from Publisher publisher order by publisher.publisherName";

	public static final String DELETE_PUBLISHER="delete from Publisher publisher where publisher.publisherId=?1";
}
