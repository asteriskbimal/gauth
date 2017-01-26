package com.field.service;

import java.util.List;

import com.field.domain.FieldGroups;

public interface FieldGroupService {


	public List<FieldGroups> findAll();

	
	public FieldGroups insert(FieldGroups arg0);
	


	public void delete(FieldGroups arg0);


	public FieldGroups findOne(FieldGroups arg0);
}
