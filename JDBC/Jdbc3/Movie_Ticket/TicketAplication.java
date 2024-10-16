package Movie_Ticket;

import java.sql.SQLException;
import java.util.List;

public class TicketAplication {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		List<MovieTicket>mt = TicketController.CreateData();
		
		//TicketService.insert(mt);
		
		TicketService.update();
		
		TicketService.display();
	}

}
