package application;

import java.time.LocalDate;

public  class Food {
	private String name;
	private Unit um;
	private float cu;
	private LocalDate date;
	
	public Food(LocalDate date) {
		super();
		this.date = date;
	}
	public Food(String name, Unit um, float cu, LocalDate date) {
		super();
		this.name = name;
		this.um = um;
		this.cu = cu;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Unit getUm() {
		return um;
	}
	public void setUm(Unit um) {
		this.um = um;
	}
	public float getCu() {
		return cu;
	}
	public void setCu(float cu) {
		this.cu = cu;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", um=" + um + ", cu=" + cu + ", date=" + date + "]";
	}
	
}
	