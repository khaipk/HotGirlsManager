package database;

import java.io.Serializable;
import java.util.Calendar;

public class HotGirl implements Serializable{
private int code;
private String name;
private String body;
private int year;
private int age;



public HotGirl() {
	super();
}
public HotGirl(int code, String name, String body, int year) {
	super();
	this.code = code;
	this.name = name;
	this.body = body;
	this.year = year;
	this.age = age;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBody() {
	return body;
}
public void setBody(String body) {
	this.body = body;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getAge() {
	Calendar now = Calendar.getInstance();
	return now.get(Calendar.YEAR)-year;
}
public void setAge(int year) {
	Calendar now = Calendar.getInstance();
	this.age = now.get(Calendar.YEAR)-year;
}
@Override
	public String toString() {
		return this.getCode()+" - "+this.getName()+" - "+this.getBody()+" - "+this.getAge();
	}


}
