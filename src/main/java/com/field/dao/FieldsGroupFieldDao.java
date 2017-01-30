package com.field.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.field.domain.FieldGroupField;
import com.field.domain.FieldGroups;
import com.field.domain.Fields;

@Repository
public interface FieldsGroupFieldDao extends JpaRepository<FieldGroupField, Long>  {
	
	@Query("Delete from FieldGroupField f where f.field_id=:fieldId")
	public void deleteByFieldId(@Param("fieldId") Long fieldId);
	
	@Query("Select g from FieldGroupField f join FieldsGroup g where f.field_grp_id=g.field_grp_id")
	public List<FieldGroups> findAllFieldGroups();
	
	@Query("Select g from FieldGroupField f join Fields g where f.field_id=g.field_id and f.field_grp_id =:fieldGrpId")
	public List<Fields> findAllFieldsByGroupId(@Param("fieldGrpId") Long fieldGrpId);
	
}
