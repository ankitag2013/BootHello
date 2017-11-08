package com.ankit.Topic;

public class Topic {

	private String id;
	private String name;
	private String des;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public Topic(String id, String name, String des) {
		super();
		this.id = id;
		this.name = name;
		this.des = des;
	}
	
}
