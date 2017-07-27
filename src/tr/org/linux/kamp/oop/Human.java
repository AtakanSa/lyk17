package tr.org.linux.kamp.oop;

public class Human {

	String name;
	int age;
	String gender;
	String id;

	public Human() {
		System.out.println("İnsan nesnesi yaratıldı");
	}

	public Human(String id, String name, String gender, int age) {
		this();
		this.age = age;
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	public void sleep() {
		System.out.println("Insan uyudu");
	}

	public void eat() {
		System.out.println("Insan yemek yedi");
	}

	public void speak() {
		System.out.println("Insan konuştu");
	}
}
