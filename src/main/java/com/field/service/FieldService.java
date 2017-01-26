package com.field.service;

import java.util.List;

import com.field.domain.Fields;

public interface FieldService {


	public List<Fields> findAll();

	
	public Fields insert(Fields arg0);
	


	public void delete(Fields arg0);


	public Fields findOne(Fields arg0);
}

