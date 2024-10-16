package Movie_Ticket;

public class MovieTicket {
	String MovieName;
	String time,circle;
	String Category;
	int price;
	
	public MovieTicket() {}

	public MovieTicket(String movieName, String time, String Circle,String category, int price) {
		super();
		MovieName = movieName;
		time = time;
		circle = Circle;
		Category = category;
		this.price = price;
	}

	@Override
	public String toString() {
		return "MovieTicket [MovieName = " + MovieName + ", Duration = " + time + ",Circle Colour = " + circle + ", Category = " + Category + ", Price = " + price
				+ "]";
	}
}
