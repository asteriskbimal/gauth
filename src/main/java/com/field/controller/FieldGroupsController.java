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

import com.field.domain.FieldGroups;
import com.field.serviceImpl.FieldGroupServiceImpl;

@RestController
public class FieldGroupsController {
	
	@Autowired
	private FieldGroupServiceImpl fieldGroupServiceImpl;

	@RequestMapping(value="ListFieldGroups", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<FieldGroups>> getFieldGroups(){
		
		List<FieldGroups> fields = fieldGroupServiceImpl.findAll();
		
		if(fields == null){
			return new ResponseEntity<List<FieldGroups>>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<FieldGroups>>(fields, HttpStatus.OK);
	}

	// path variable define in url path /ListField/{id}
	@RequestMapping(value = "/ListFieldGroup/{id}", method = RequestMethod.GET)
	public ResponseEntity<FieldGroups> getFieldGroups(@PathVariable Long id) {

				
		FieldGroups category = fieldGroupServiceImpl.findOne(id);

		if (category == null) {
			return new ResponseEntity<FieldGroups>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<FieldGroups>(category, HttpStatus.OK);
	}

	// Creating new FieldGroups
	@RequestMapping(value = "/CreateFieldGroup", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<FieldGroups> createFieldGroups(FieldGroups field) {
		return new ResponseEntity<FieldGroups>(fieldGroupServiceImpl.insert(field), HttpStatus.CREATED);
	}

	// Updating new FieldGroups
	@RequestMapping(value = "/UpdateFieldGroup", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateFieldGroups(FieldGroups fields) {
		fieldGroupServiceImpl.update(fields);
		return new ResponseEntity<String>("FieldGroups Updated", HttpStatus.CREATED);
	}

	// Deleting new FieldGroups
	@RequestMapping(value = "/DeleteFieldGroup/{id}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> deleteFieldGroups(@PathVariable Long id) {
		fieldGroupServiceImpl.delete(id);
		return new ResponseEntity<String>("FieldGroups with id : " + id + " Successfully deleted", HttpStatus.CREATED);
	}

	

}
