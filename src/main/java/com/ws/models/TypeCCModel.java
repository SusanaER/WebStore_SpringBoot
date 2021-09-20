package com.ws.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="type_cc" , catalog="db_web_store", schema="")
public class TypeCCModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer Type_CC_ID;
	@Column
	private String Type;
	public Integer getType_CC_ID() {
		return Type_CC_ID;
	}
	public void setType_CC_ID(Integer type_CC_ID) {
		Type_CC_ID = type_CC_ID;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	
}
