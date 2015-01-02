package de.scrum_master.app;

/**
 * Sample application using 'SampleObject' class from module 'data-objects' as well as
 * ITD aspects from modules 'aspect-javabean' and 'aspect-json'
 */
public class Application {
	public static void main(String[] args) {
		SampleObject sampleObject = new SampleObject("John Doe", 33);
		System.out.println(sampleObject);
		System.out.println("\nJava Bean properties:");
		System.out.println("  " + sampleObject.getName());
		System.out.println("  " + sampleObject.getAge());
		System.out.println("\nJSON properties:");
		System.out.println("  " + sampleObject.getNameValue());
		System.out.println("  " + sampleObject.getAgeValue());
	}
}
