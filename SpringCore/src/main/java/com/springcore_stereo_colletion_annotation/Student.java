package com.springcore_stereo_colletion_annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("#{nl}")
	private List<String> Names;

	public List<String> getNames() {
		return Names;
	}

	public void setNames(List<String> names) {
		Names = names;
	}

	@Override
	public String toString() {
		return "Student [Names=" + Names + "]";
	}
	
	
}
