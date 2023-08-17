package com.springcore.sterotypeannotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Planets {
	@Value("Earth")
	private String name;
	@Value("Blue")
	private String color;
	
	@Value("#{element}")
	private List<String> elements;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("using setter injection ...");
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		System.out.println("using setter injection ...");
		this.color = color;
	}
	
	
	public List<String> getElements() {
		return elements;
	}
	public void setElements(List<String> elements) {
		this.elements = elements;
	}
	
	
	public Planets(String name, String color, List<String> elements) {
		super();
		System.out.println("using Constructor injection ...");
		this.name = name;
		this.color = color;
		this.elements = elements;
	}
	public Planets() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Planets [name=" + name + ", color=" + color + ", elements=" + elements + "]";
	}
	
	
	

}
