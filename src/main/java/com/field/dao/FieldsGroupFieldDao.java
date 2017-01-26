package com.field.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.field.domain.FieldGroupField;

@Repository
public interface FieldsGroupFieldDao extends JpaRepository<FieldGroupField, Long>  {

}
