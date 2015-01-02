package de.scrum_master.aspect;

import de.scrum_master.app.SampleObject;

privileged aspect SampleObject_Json {
	public String SampleObject.getNameValue() {
		return "\"Name\" : " + (name == null ? "null" :"\"" + name + "\"");
	}

	public String SampleObject.getAgeValue() {
		return "\"Age\" : " + age;
	}
}
