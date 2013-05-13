package com.ecom.demo.dao;

import java.util.List;

import com.ecom.demo.bo.Demo;

public interface DemoDAO {
	
	public void insertDemo(Demo demo);
	
	public List<Demo> getDemoList();

}
