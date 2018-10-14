package AbstractionInterface;

import java.util.Date;

public class JetAirBus  implements Flight,USAFlight{


	@Override
	public void searchflights() {
		System.out.println("Hi Welcome To JetAirBus");
		
	}

	@Override
	public void bookTicket() {

		System.out.println("Hi congrats -Your ticket has been booked succesfully in jet airbus");

		
	}
//here we have Override method from USAFlight Interface
	@Override
	public void getTravelingCost(String source, String Destination, Date date) {
		System.out.println("From "+source+" to "+Destination+" date "+date+" coct is  700$");
				
				
				
				
				
		
	}
	


}
