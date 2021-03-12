package com.dev.domain;

public class Topic {
	
	private String name;
	private String type;
	private String desc;
	
	public Topic() {	
	}
	
	public Topic(String name, String type, String desc) {
		super();
		this.name = name;
		this.type = type;
		this.desc = desc;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

}
