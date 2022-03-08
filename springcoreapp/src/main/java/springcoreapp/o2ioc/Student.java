package springcoreapp.o2ioc;

import java.io.Serializable;

// On manipule des POJO 
// on a besoin de getters setters, d'un constructeur sans paramètres et 
// implémente Serializable
public class Student implements Serializable {

	private static final long serialVersionUID = 4759438525564105689L;
	
	private String studentName;

	public String getStudentName() {
		System.out.println("getStudentName");
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("setStudentName");
		this.studentName = studentName;
	}
	
	public void displayInfo() {
		System.out.println("Hello, my name is : " + studentName);
	}

	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}

	public Student() {
		super();
		System.out.println("Constructeur de Student");
	}
	
	public void myInitMethod() {
		System.out.println("myInitMethod");
	}
	
	public void myDestroyMethod() {
		System.out.println("myDestroyMethod");
	}
}
