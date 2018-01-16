package de.htwberlin.ohdm.lod.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "classification")
public class Classification {
	
	@Id
	private long id;
	
	@Column(name = "class")
	private String class_name;
	
	@Column(name = "subclassname")
	private String subclass_name;
	
	public Long getId(){
		return id;
	}
	
	public String getClass_name(){
		return class_name;
	}
	
	public String getSubclass_name(){
		return subclass_name;
	}
	

}
