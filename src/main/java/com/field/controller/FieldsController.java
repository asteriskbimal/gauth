package com.field.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.field.domain.Fields;
import com.field.serviceImpl.FieldServiceImpl;

@RestController
public class FieldsController {
	
	@Autowired
	private FieldServiceImpl fieldServiceImpl;

	@RequestMapping(value="ListFields", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<Fields>> getFields(){
		
		List<Fields> fields = fieldServiceImpl.findAll();
		
		if(fields == null){
			return new ResponseEntity<List<Fields>>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<Fields>>(fields, HttpStatus.OK);
	}

	// path variable define in url path /ListProductItem/{id}
	@RequestMapping(value = "/ListField/{id}", method = RequestMethod.GET)
	public ResponseEntity<Fields> getField(@PathVariable Long id) {

				
		Fields category = fieldServiceImpl.findOne(id);

		if (category == null) {
			return new ResponseEntity<Fields>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Fields>(category, HttpStatus.OK);
	}

	// Creating new Fields
	@RequestMapping(value = "/CreateField", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Fields> createField(Fields field) {
		return new ResponseEntity<Fields>(fieldServiceImpl.insert(field), HttpStatus.CREATED);
	}

	// Updating new Fields
	@RequestMapping(value = "/UpdateField", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateField(Fields fields) {
		fieldServiceImpl.update(fields);
		return new ResponseEntity<String>("Fields Updated", HttpStatus.CREATED);
	}

	// Deleting new Fields
	@RequestMapping(value = "/DeleteField/{id}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> deleteField(@PathVariable Long id) {
		fieldServiceImpl.delete(id);
		return new ResponseEntity<String>("Fields with id : " + id + " Successfully deleted", HttpStatus.CREATED);
	}

}
