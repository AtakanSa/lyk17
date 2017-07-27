package tr.org.linux.kamp.oop2;

public class Animal {
	private String eyeColor;
	private String furColor;
	private int age;
	private String name;
	private String species;

	public Animal(String name,String eyeColor, String furColor, int age, String species) {
		super();
		this.name = name;
		this.eyeColor = eyeColor;
		this.furColor = furColor;
		this.age = age;
		this.species = species;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
}
