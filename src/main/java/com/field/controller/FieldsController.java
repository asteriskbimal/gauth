package com.field.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.field.domain.FieldGroupField;
import com.field.domain.FieldGroupWrapper;
import com.field.domain.Fields;
import com.field.serviceImpl.FieldGroupFieldServiceImpl;
import com.field.serviceImpl.FieldServiceImpl;

@RestController
public class FieldsController {
	
	@Autowired
	private FieldServiceImpl fieldServiceImpl;
	
	@Autowired
	private FieldGroupFieldServiceImpl fieldGroupFieldServiceImpl;

	@RequestMapping(value="ListFields", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<Fields>> getFields(){
		
		List<Fields> fields = fieldServiceImpl.findAll();
		
		if(fields == null){
			return new ResponseEntity<List<Fields>>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<Fields>>(fields, HttpStatus.OK);
	}

	// path variable define in url path /ListField/{id}
	@RequestMapping(value = "/ListField/{id}", method = RequestMethod.GET)
	public ResponseEntity<Fields> getField(@PathVariable Long id) {

				
		Fields category = fieldServiceImpl.findOne(id);

		if (category == null) {
			return new ResponseEntity<Fields>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Fields>(category, HttpStatus.OK);
	}

	// Creating new Fields
	@RequestMapping(value = "/CreateField", method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Fields> createField(@RequestBody FieldGroupWrapper FieldGroupWrapper) {
		
		System.out.println(FieldGroupWrapper.getField().getCrt_user());
		Fields fieldx=fieldServiceImpl.insert(FieldGroupWrapper.getField());
		FieldGroupField fgrpf=new FieldGroupField();
		
		if(fieldx!=null){
			fgrpf.setField_id(fieldx.getField_id());
			fgrpf.setField_grp_id(FieldGroupWrapper.getGroupId());
			fgrpf.setCrt_dt(fieldx.getCrt_dt());
			fgrpf.setCrt_user(fieldx.getCrt_user());
			fgrpf.setLast_upd_dt(fieldx.getLast_upd_dt());
			fgrpf.setLast_upd_user(fgrpf.getLast_upd_user());
			fgrpf.setStatus('A');
		}
		
		System.out.println(fieldGroupFieldServiceImpl.insert(fgrpf).toString());
		return new ResponseEntity<Fields>(fieldx, HttpStatus.CREATED);
	}

	// Updating new Fields
	@RequestMapping(value = "/UpdateField", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateField(Fields fields) {
		fieldServiceImpl.update(fields);
		return new ResponseEntity<String>("Fields Updated", HttpStatus.CREATED);
	}

	// Deleting new Fields
	@RequestMapping(value = "/DeleteField/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> deleteField(@PathVariable Long id) {
		fieldServiceImpl.delete(id);
		fieldGroupFieldServiceImpl.deleteByFieldId(id);
		return new ResponseEntity<String>("Fields with id : " + id + " Successfully deleted", HttpStatus.CREATED);
	}

}
