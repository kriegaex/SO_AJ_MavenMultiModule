package de.scrum_master.app;

public class SampleObject {
	private String name;
	private int age;

	public SampleObject(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "SampleObject{" + "name='" + name + '\'' + ", age=" + age + '}';
	}
}
