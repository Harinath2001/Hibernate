package com.xyz.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employe {
	@Id
	private int empno;
	private String ename;
	private int sal;
	public Employe()
	{}
	public Employe(int empno,String ename,int sal) {
		this.empno=empno;
		this.ename=ename;
		this.sal=sal;
	}
	public int geteno() {
		return empno;
		}
	public void seteno( int empno) {
		this.empno=empno;
	}
	public String getename() {
		return ename;
	}
	public void setename(String ename) {
		this.ename=ename;
	}
	public int getsal() {
		return sal;
	}
	public void setsal(int sal)
	{
		this.sal=sal;
		
	}

}
