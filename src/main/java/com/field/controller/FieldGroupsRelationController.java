package com.field.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.field.domain.FieldGroupField;
import com.field.domain.FieldGroups;
import com.field.domain.Fields;
import com.field.domain.GroupWrapper;
import com.field.domain.RelationWrapper;
import com.field.serviceImpl.FieldGroupFieldServiceImpl;
import com.field.serviceImpl.FieldGroupServiceImpl;
import com.field.serviceImpl.FieldServiceImpl;

@RestController
public class FieldGroupsRelationController {
	
	@Autowired
	private FieldGroupFieldServiceImpl fieldGroupFieldServiceImpl;
	
	@Autowired
	private FieldServiceImpl fieldServiceImpl;
	
	@Autowired
	private FieldGroupServiceImpl fieldGroupServiceImpl;

	@RequestMapping(value="ListFieldGroups", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<RelationWrapper>> getAllFieldAndGroups(){
		
		List<RelationWrapper>  relationWrapperList=new ArrayList<RelationWrapper>();
		List<GroupWrapper>		groupWrapperList=new ArrayList<GroupWrapper>();	
		List<Fields> fieldList= new ArrayList<Fields>();
		
		for(FieldGroupField r:fieldGroupFieldServiceImpl.findAll()){
			RelationWrapper rx=new RelationWrapper();
			rx.setFieldGroupField(r);
			relationWrapperList.add(rx);
		}
		
		
		
		return new ResponseEntity<List<RelationWrapper>>(HttpStatus.OK);
	}

//	// path variable define in url path /ListField/{id}
//	@RequestMapping(value = "/ListFieldGroup/{id}", method = RequestMethod.GET)
//	public ResponseEntity<FieldGroups> getFieldGroups(@PathVariable Long id) {
//
//				
//		FieldGroups category = fieldGroupFieldServiceImpl.findOne(id);
//
//		if (category == null) {
//			return new ResponseEntity<FieldGroups>(HttpStatus.NOT_FOUND);
//		}
//
//		return new ResponseEntity<FieldGroups>(category, HttpStatus.OK);
//	}
//
//	// Creating new FieldGroups
//	@RequestMapping(value = "/CreateFieldGroup", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<FieldGroups> createFieldGroups(FieldGroups field) {
//		return new ResponseEntity<FieldGroups>(fieldGroupFieldServiceImpl.insert(field), HttpStatus.CREATED);
//	}
//
//	// Updating new FieldGroups
//	@RequestMapping(value = "/UpdateFieldGroup", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<String> updateFieldGroups(FieldGroups fields) {
//		fieldGroupFieldServiceImpl.update(fields);
//		return new ResponseEntity<String>("FieldGroups Updated", HttpStatus.CREATED);
//	}
//
//	// Deleting new FieldGroups
//	@RequestMapping(value = "/DeleteFieldGroup/{id}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<String> deleteFieldGroups(@PathVariable Long id) {
//		fieldGroupFieldServiceImpl.delete(id);
//		return new ResponseEntity<String>("FieldGroups with id : " + id + " Successfully deleted", HttpStatus.CREATED);
//	}

	

}
