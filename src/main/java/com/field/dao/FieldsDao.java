package com.field.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.field.domain.Fields;

@Repository
public interface FieldsDao extends JpaRepository<Fields, Long> {

   
}
