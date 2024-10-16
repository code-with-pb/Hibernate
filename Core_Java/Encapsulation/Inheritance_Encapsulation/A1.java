package Inheritance_Encapsulation;

public class A1 {
	private int id;
	private String name;
	private float cgpa;
	private String major;
	private int year;
	
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
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "A1 [id = " + id + ", name = " + name + ", cgpa = " + cgpa + ", major = " + major + ", year = " + year + "]";
	}
	
	
	
}
