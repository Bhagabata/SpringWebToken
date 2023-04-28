package com.Client;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
public class Employee implements Serializable {
	 @Id
	 @Column(name="Employee_ID")
	 @GeneratedValue(strategy = GenerationType.AUTO)	
private int eid;
	 @Column(name="Employee_Name")
private String ename;
	 @Column(name="Employee_Number")
private String enumber;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEnumber() {
		return enumber;
	}
	public void setEnumber(String enumber) {
		this.enumber = enumber;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", enumber=" + enumber + "]";
	}
}
