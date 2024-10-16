package Task1;

public class CRUD {
	int Id;
	String Name;
	float Marks;
	int Year;
	
	CRUD(){}
	
	public CRUD(int id) {
		super();
		Id = id;
	}
	
	public CRUD(float marks) {
		super();
		Marks = marks;
	}

	public CRUD(int id, String name) {
		super();
		Id = id;
		Name = name;
	}
	
	public CRUD(int id, String name, float marks) {
		super();
		Id = id;
		Name = name;
		Marks = marks;
	}

	public CRUD(int id, String name, float marks, int year) {
		super();
		Id = id;
		Name = name;
		Marks = marks;
		Year = year;
	}

	@Override
	public String toString() {
		return "CRUD [Id = " + Id + ", Name = " + Name + ", Marks = " + Marks + ", Year = " + Year + "]";
	}
	
	
}
