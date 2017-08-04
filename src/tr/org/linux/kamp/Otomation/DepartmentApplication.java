package tr.org.linux.kamp.Otomation;

public class DepartmentApplication {

	public static void main(String[] args) {
		Student Beydo = new Student("Beydullah", 1);
		Student Atakan = new Student("Atakan", 2);
		Student Ali = new Student("Ali", 3);
		Student Eray = new Student("Eray", 4);
		Student Mustafa = new Student("Mustafa", 5);

		Department dep = new Department("Ogrenciler", "Muhendislik");

		Course curse = new Course("Yazılım", dep, "Beydullah");

		dep.addStudent(Atakan);
		dep.addStudent(Ali);
		curse.registerToCourse(Beydo);
		curse.registerToCourse(Eray);
		curse.registerToCourse(Mustafa);

		System.out.println(curse.toString());
		System.out.println(dep.toString());
	}
}
