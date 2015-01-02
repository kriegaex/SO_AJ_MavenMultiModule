package de.scrum_master.aspect;

import de.scrum_master.app.SampleObject;

privileged aspect SampleObject_JavaBean {
	public String SampleObject.getName() {
		return name;
	}

	public int SampleObject.getAge() {
		return age;
	}
}
