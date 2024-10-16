package Movie;

public class abcget {
	String MovieName,Duration,Category,TicketCost,colour;

	/*public String getMovieName() {
		return MovieName;
	}*/

	public void setMovieName(String movieName) {
		MovieName = movieName;
	}

	/*public String getDuration() {
		return Duration;
	}*/

	public void setDuration(String duration) {
		Duration = duration;
	}

	/*public String getCategory() {
		return Category;
	}*/

	public void setCategory(String category) {
		Category = category;
	}

	/*public String getTicketCost() {
		return TicketCost;
	}*/

	public void setTicketCost(String ticketCost) {
		TicketCost = ticketCost;
	}

	/*public String getColour() {
		return colour;
	}*/

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "abcget [MovieName=" + MovieName + ", Duration=" + Duration + ", Category=" + Category + ", TicketCost="
				+ TicketCost + ", colour=" + colour + "]";
	}

}
