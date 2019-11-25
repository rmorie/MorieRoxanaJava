package menu;



public class Food {
	private	String name;
	private Float calorii;
	private String um;



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getCalorii() {
		return calorii;
	}

	public void setCalorii(Float calorii) {
		this.calorii = calorii;
	}

	public String getUm() {
		return um;
	}

	public void setUm(String um) {
		this.um = um;
	}

	public Food(String name, Float calorii, String um) {
		super();
		this.name = name;
		this.calorii = calorii;
		this.um = um;
	}

	public Food() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", calorii=" + calorii + ", um=" + um + "]";
	}



}

