package AbstractionInterface;

import java.util.Date;

public class InterfaceTest {

	public static void main(String[] args) {
		
		Flight flight	= new AirIndia();
		flight.bookTicket();
		flight.searchflights();
		
		
		JetAirBus jet =new JetAirBus();
		jet.bookTicket();
		jet.searchflights();
		jet.getTravelingCost("NewYark", "Dallas", new Date());
		
		
	}
}

