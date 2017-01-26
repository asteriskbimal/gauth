package com.field.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.field.dao.FieldsDao;
import com.field.domain.Fields;
import com.field.service.FieldService;

@Service
public class FieldServiceImpl implements FieldService {

	@Autowired
	private FieldsDao fieldsDao;

	@Override
	public List<Fields> findAll() {
		return (List<Fields>) fieldsDao.findAll();
	}

	@Override
	public Fields insert(Fields arg0) {
		return fieldsDao.save(arg0);
	}

	@Override
	public void delete(Long arg0) {
		fieldsDao.delete(arg0);

	}

	@Override
	public Fields findOne(Long arg0) {
		return fieldsDao.findOne(arg0);
	}

	@Override
	public Fields update(Fields arg0) {
		return fieldsDao.save(arg0);
	}

}
