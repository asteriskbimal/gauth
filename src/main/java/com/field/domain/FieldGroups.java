package com.field.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="field_groups")
public class FieldGroups {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long field_grp_id;
	String field_grp_nm;
	String field_grp_des;
	Character status;
	@Temporal(value = TemporalType.TIMESTAMP)
	Date crt_dt;
	String crt_user;
	@Temporal(value = TemporalType.TIMESTAMP)
	Date last_upd_dt;
	String last_upd_user;
	
	@OneToMany
	@JsonIgnore
	List<Fields> fieldList=new ArrayList<Fields>();

	

	public Long getField_grp_id() {
		return field_grp_id;
	}

	public String getField_grp_nm() {
		return field_grp_nm;
	}

	public void setField_grp_nm(String field_grp_nm) {
		this.field_grp_nm = field_grp_nm;
	}

	public String getField_grp_des() {
		return field_grp_des;
	}

	public void setField_grp_des(String field_grp_des) {
		this.field_grp_des = field_grp_des;
	}

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	public Date getCrt_dt() {
		return crt_dt;
	}

	public void setCrt_dt(Date crt_dt) {
		this.crt_dt = crt_dt;
	}

	public String getCrt_user() {
		return crt_user;
	}

	public void setCrt_user(String crt_user) {
		this.crt_user = crt_user;
	}

	public Date getLast_upd_dt() {
		return last_upd_dt;
	}

	public void setLast_upd_dt(Date last_upd_dt) {
		this.last_upd_dt = last_upd_dt;
	}

	public String getLast_upd_user() {
		return last_upd_user;
	}

	public void setLast_upd_user(String last_upd_user) {
		this.last_upd_user = last_upd_user;
	}

}
