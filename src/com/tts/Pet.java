package com.tts;

public class Pet {

	private String name;
	private int age;
	private String location;
	private String type;
	
	public Pet() {
		this.name = "default";
		this.age = 0;
		this.location = "default";
		this.type = "default";
	}
	
	public Pet(String name, int age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.location);
		System.out.println(this.type);
	}
	
}
