package com.king.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Company {

	private List<String> projects;
	private Set<String> managers;
	private Map<String, Double> salaries;
	public List<String> getProjects() {
		return projects;
	}
	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	public Set<String> getManagers() {
		return managers;
	}
	public void setManagers(Set<String> managers) {
		this.managers = managers;
	}
	public Map<String, Double> getSalaries() {
		return salaries;
	}
	public void setSalaries(Map<String, Double> salaries) {
		this.salaries = salaries;
	}
	@Override
	public String toString() {
		return "Company [projects=" + projects + ", managers=" + managers + ", salaries=" + salaries + "]";
	}
	
	
}
