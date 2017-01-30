package com.field.service;

import java.util.List;

import com.field.domain.FieldGroupField;
import com.field.domain.FieldGroups;
import com.field.domain.Fields;

public interface FieldGroupFieldService {


	public List<FieldGroupField> findAll();
	
	public FieldGroupField insert(FieldGroupField arg0);
	
	public FieldGroupField update(FieldGroupField arg0);
	
	public void delete(Long arg0);

	public FieldGroupField findOne(Long arg0);
	
	public void deleteByFieldId(Long arg0);
	
	public List<FieldGroups> findAllFieldGroups();
	
	public List<Fields> findAllFieldsByGroupId(Long id);
}
