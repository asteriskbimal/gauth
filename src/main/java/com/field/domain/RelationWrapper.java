package com.field.domain;

import java.util.ArrayList;
import java.util.List;

public class RelationWrapper {

	FieldGroupField fieldGroupField;
	
	List<GroupWrapper> fieldGroupList = new ArrayList<GroupWrapper>();

	public FieldGroupField getFieldGroupField() {
		return fieldGroupField;
	}

	public void setFieldGroupField(FieldGroupField fieldGroupField) {
		this.fieldGroupField = fieldGroupField;
	}

	public List<GroupWrapper> getFieldGroupList() {
		return fieldGroupList;
	}

	public void setFieldGroupList(List<GroupWrapper> fieldGroupList) {
		this.fieldGroupList = fieldGroupList;
	}

}
