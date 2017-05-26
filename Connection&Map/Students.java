package com.javac;

//public class Students implements Comparable{
public class Students{
	private String name;
	private int age;
	private int grade;
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Students(String name,int age,int grade){
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/*public int compareTo(Object obj){
		Students student = (Students)obj;
		if(this.age>student.age){
			return 1;
		}
		if(this.age<student.age){
			return -1;
		}
		return 0;
	}*/
	public String toString(){
		return getName()+"------"+getAge()+"------"+getGrade();
	}
}
