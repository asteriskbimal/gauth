package com.field.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.field.domain.FieldGroups;

@Repository
public interface FieldsGroupDao extends JpaRepository<FieldGroups, Long>  {
	

//	@Query("Delete from FieldGroupField f where f.field_id=:fieldId")
//	public void findGroupByRelationId(@Param("fieldId") Long fieldId);
}
