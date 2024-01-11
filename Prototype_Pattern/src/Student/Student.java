package Student;

import Model.Prototype;

public class Student implements Prototype{
	
	private String name;
	private int age;
	private int rollNo;
	
	Student(){
		
	}
	public Student(int age, int rollNo, String name){
		this.age = age;
		this.rollNo = rollNo;
		this.name = name;
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
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public Prototype clone() {
		return new Student(age, rollNo + 1, name);
	}
	
}
