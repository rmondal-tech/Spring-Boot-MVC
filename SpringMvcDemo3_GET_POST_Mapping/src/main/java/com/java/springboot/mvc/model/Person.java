package com.java.springboot.mvc.model;

public class Person {
	public String pname;
	public int pid;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", pid=" + pid + "]";
	}

	
	
	
	
	
	
	
}
