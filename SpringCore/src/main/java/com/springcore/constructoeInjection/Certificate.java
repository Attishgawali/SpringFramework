package com.springcore.constructoeInjection;

import java.util.List;

public class Certificate {
	
	private int cartiId;
	private String certiName;
	private List<String> languages;
	
	public Certificate(int cartiId, String certiName, List<String> languages) {
		super();
		this.cartiId = cartiId;
		this.certiName = certiName;
		this.languages = languages;
	}
	@Override
	public String toString() {
		return "Certificate [cartiId=" + cartiId + ", certiName=" + certiName + ", languages=" + languages + "]";
	}
	
	
	
}
