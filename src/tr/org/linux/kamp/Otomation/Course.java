package tr.org.linux.kamp.Otomation;

import java.util.ArrayList;

public class Course {
	private String name;
	private Department department;
	private String lecturerName;
	private ArrayList<Student> registeredStudents = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getLecturerName() {
		return lecturerName;
	}

	public void setLecturerName(String lecturerName) {
		this.lecturerName = lecturerName;
	}

	public ArrayList<Student> getRegisteredStudents() {
		return registeredStudents;
	}

	public void setRegisteredStudents(ArrayList<Student> registeredStudents) {
		this.registeredStudents = registeredStudents;
	}

	public Course(String name, Department department, String lecturerName) {
		super();
		this.name = name;
		this.department = department;
		this.lecturerName = lecturerName;

	}

	public void registerToCourse(Student student) {
		registeredStudents.add(student);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getLecturerName() + getName() + registeredStudents.toString() + getDepartment();
	}

}
