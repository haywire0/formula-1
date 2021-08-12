package test.formula1.springboot.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class teams {
	private int id;
	private String name;
	private String engine;
	private String tyres;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getTyres() {
		return tyres;
	}
	public void setTyres(String tyres) {
		this.tyres = tyres;
	}
}
