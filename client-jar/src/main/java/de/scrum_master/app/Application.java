package de.scrum_master.app;

import java.lang.reflect.InvocationTargetException;

/**
 * Sample application using 'SampleObject' class from module 'data-objects' as well as
 * ITD aspects from modules 'aspect-javabean' and 'aspect-json'
 */
public class Application {
	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		SampleObject sampleObject = new SampleObject("John Doe", 33);
		System.out.println(sampleObject);

		System.out.println("\nJava Bean properties:");
		try {
			System.out.println("  " + SampleObject.class.getMethod("getName").invoke(sampleObject));
			System.out.println("  " + SampleObject.class.getMethod("getAge").invoke(sampleObject));
		} catch (NoSuchMethodException e) {
			System.out.println("  unavailable (inactive aspect)");
		}

		System.out.println("\nJSON properties:");
		try {
			System.out.println("  " + SampleObject.class.getMethod("getNameValue").invoke(sampleObject));
			System.out.println("  " + SampleObject.class.getMethod("getAgeValue").invoke(sampleObject));
		} catch (NoSuchMethodException e) {
			System.out.println("  unavailable (inactive aspect)");
		}
	}
}
