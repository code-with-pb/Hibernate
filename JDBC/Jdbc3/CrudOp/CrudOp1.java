package CrudOp;

public class CrudOp1 {
	int id;
	String Name;
	float marks;
	int y;
	
	CrudOp1(){}

	public CrudOp1(int id, String name, float marks, int y) {
		super();
		this.id = id;
		Name = name;
		this.marks = marks;
		this.y = y;
	}

	@Override
	public String toString() {
		return "CrudOp1 [Id = " + id + ", Name = " + Name + ", Marks = " + marks + ", y = " + y + "]";
	}
	
	
}
