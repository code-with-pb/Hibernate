package Movie_Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketController {

	public static List<MovieTicket> CreateData() {
		// TODO Auto-generated method stub
		List<MovieTicket> mt = new ArrayList<>();
		
		mt.add(new MovieTicket("Abc","3hr","gold","2D",300));
		mt.add(new MovieTicket("DEF","2hr","gold","3D",500));
		mt.add(new MovieTicket("XYZ","3hr","silver","2D",250));
		mt.add(new MovieTicket("OPQ","2hr","silver","3D",450));
		
		return mt;
	}

}
