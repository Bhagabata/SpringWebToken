package com.example.demoSpringBoot.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PASSPORT_DETAILS")
public class Passport {
	@Id
int STD_ID;
String STD_NAME;
String Passport_Number;
public Passport() {
	super();
	// TODO Auto-generated constructor stub
}
public Passport(int sTD_ID, String sTD_NAME, String passport_Number) {
	super();
	STD_ID = sTD_ID;
	STD_NAME = sTD_NAME;
	Passport_Number = passport_Number;
}
public int getSTD_ID() {
	return STD_ID;
}
public void setSTD_ID(int sTD_ID) {
	STD_ID = sTD_ID;
}
public String getSTD_NAME() {
	return STD_NAME;
}
public void setSTD_NAME(String sTD_NAME) {
	STD_NAME = sTD_NAME;
}
public String getPassport_Number() {
	return Passport_Number;
}
public void setPassport_Number(String passport_Number) {
	Passport_Number = passport_Number;
}

}
