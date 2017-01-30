package com.field.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.field.dao.FieldsGroupFieldDao;
import com.field.domain.FieldGroupField;
import com.field.domain.FieldGroups;
import com.field.domain.Fields;
import com.field.service.FieldGroupFieldService;

@Service
public class FieldGroupFieldServiceImpl implements FieldGroupFieldService{
	
	
	 @Autowired
	 private FieldsGroupFieldDao fieldsGroupFieldDao;
	 
	@Override
	public List<FieldGroupField> findAll() {
		return fieldsGroupFieldDao.findAll();
	}

	@Override
	public FieldGroupField insert(FieldGroupField arg0) {
		return fieldsGroupFieldDao.save(arg0);
	}
														
	@Override
	public void delete(Long arg0) {
		fieldsGroupFieldDao.delete(arg0);
		
	}

	@Override
	public FieldGroupField findOne(Long arg0) {
		
		return fieldsGroupFieldDao.findOne(arg0);
	}

	@Override
	public FieldGroupField update(FieldGroupField arg0) {
		return fieldsGroupFieldDao.save(arg0);
	}

	@Override
	public void deleteByFieldId(Long arg0) {
		fieldsGroupFieldDao.deleteByFieldId(arg0);
		
	}

	@Override
	public List<FieldGroups> findAllFieldGroups() {
		return fieldsGroupFieldDao.findAllFieldGroups();
	}

	@Override
	public List<Fields> findAllFieldsByGroupId(Long id) {
		return fieldsGroupFieldDao.findAllFieldsByGroupId(id);
	}

}
