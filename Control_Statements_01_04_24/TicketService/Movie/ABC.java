package Movie;

public class ABC {
	String MovieName,Duration,Category,TicketCost;

	public ABC() {
		// TODO Auto-generated constructor stub
	}

	public ABC(String movieName, String duration, String category, String ticketCost) {
		super();
		MovieName = movieName;
		Duration = duration;
		Category = category;
		TicketCost = ticketCost;
	}

	@Override
	public String toString() {
		return "ABC [MovieName=" + MovieName + ", Duration=" + Duration + ", Category=" + Category + ", TicketCost="
				+ TicketCost + "]";
	}
	
	
}
