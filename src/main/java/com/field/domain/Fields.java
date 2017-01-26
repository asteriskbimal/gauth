/**
 * 
 */
package com.field.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Bimal
 *
 */

@Entity
public class Fields {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long field_id;

	String field_nm;
	String field_desc;
	Character status;
	@Temporal(value = TemporalType.TIMESTAMP)
	Date crt_dt;
	String crt_user;
	@Temporal(value = TemporalType.TIMESTAMP)
	Date last_upd_dt;
	String last_upd_user;

	
	public Long getField_id() {
		return field_id;
	}

	public String getField_nm() {
		return field_nm;
	}

	public void setField_nm(String field_nm) {
		this.field_nm = field_nm;
	}

	public String getField_desc() {
		return field_desc;
	}

	public void setField_desc(String field_desc) {
		this.field_desc = field_desc;
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
