package com.infosys.grievence.dto;

import java.time.LocalDate;

public class Grievencedto {

	private Integer id;
	private String name;
	private String statement;
	private LocalDate date;
	
	
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	public Integer getId() {
		return id;
	}
	@Override
	public String toString() {
		return "DemoDto [id=" + id + ", name=" + name + "]";
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
