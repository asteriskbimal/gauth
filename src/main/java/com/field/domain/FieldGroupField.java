package com.field.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "field_groups_field_relations")
public class FieldGroupField {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long field_grp_field_id;
	Long field_grp_id;
	Long field_id;
	Character status;
	@Temporal(value = TemporalType.TIMESTAMP)
	Date crt_dt;
	String crt_user;
	@Temporal(value = TemporalType.TIMESTAMP)
	Date last_upd_dt;
	String last_upd_user;

	public Long getField_grp_field_id() {
		return field_grp_field_id;
	}

	public Long getField_grp_id() {
		return field_grp_id;
	}

	public void setField_grp_id(Long field_grp_id) {
		this.field_grp_id = field_grp_id;
	}

	public Long getField_id() {
		return field_id;
	}

	public void setField_id(Long field_id) {
		this.field_id = field_id;
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
