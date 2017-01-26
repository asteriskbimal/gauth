package com.field.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.field.dao.FieldsGroupDao;
import com.field.domain.FieldGroups;
import com.field.service.FieldGroupService;

public class FieldGroupServiceImpl implements FieldGroupService{
	
	
	 @Autowired
	 private FieldsGroupDao fieldsGroupDao;
	 
	@Override
	public List<FieldGroups> findAll() {
		return (List<FieldGroups>) fieldsGroupDao.findAll();
	}

	@Override
	public FieldGroups insert(FieldGroups arg0) {
		return fieldsGroupDao.save(arg0);
	}

	@Override
	public void delete(Long arg0) {
		fieldsGroupDao.delete(arg0);
		
	}

	@Override
	public FieldGroups findOne(Long arg0) {
		
		return fieldsGroupDao.findOne(arg0);
	}

	@Override
	public FieldGroups update(FieldGroups arg0) {
		return fieldsGroupDao.save(arg0);
	}

}
