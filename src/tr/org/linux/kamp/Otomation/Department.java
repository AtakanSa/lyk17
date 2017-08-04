package tr.org.linux.kamp.Otomation;

import java.util.ArrayList;
import java.util.HashMap;

public class Department extends HashMap {
	private String name;
	private String facultyName;
	int i = 1;
	private HashMap<Integer, Student> students = new HashMap<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public Department(String name, String facultyName) {
		super();
		this.name = name;
		this.facultyName = facultyName;

	}

	public HashMap<Integer, Student> getStudents() {
		return students;
	}

	public void setStudents(HashMap<Integer, Student> students) {
		this.students = students;
	}

	public void addStudent(Student student) {
		students.put(i, student);
		i++;
	}

	//// se seh seydi da miney kunduda miney vecdida

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getFacultyName() + getName() + getStudents().toString();
	}

}
