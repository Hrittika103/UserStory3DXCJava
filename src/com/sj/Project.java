package com.sj;

public class Project {

	int pid;
	String title;
	String description;
	String domain;


	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pid, String title, String description, String domain) {
		super();
		this.pid = pid;
		this.title = title;
		this.description = description;
		this.domain = domain;
	}
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	
}
