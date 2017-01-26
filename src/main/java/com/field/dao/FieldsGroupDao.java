package com.field.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.field.domain.FieldGroups;

@Repository
public interface FieldsGroupDao extends JpaRepository<FieldGroups, Long>  {
	

}
