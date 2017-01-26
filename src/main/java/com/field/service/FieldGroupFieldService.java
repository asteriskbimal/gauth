package com.field.service;

import java.util.List;

import com.field.domain.FieldGroupField;

public interface FieldGroupFieldService {


	public List<FieldGroupField> findAll();

	
	public FieldGroupField insert(FieldGroupField arg0);
	
	public FieldGroupField update(FieldGroupField arg0);
	
	public void delete(Long arg0);


	public FieldGroupField findOne(Long arg0);
}
