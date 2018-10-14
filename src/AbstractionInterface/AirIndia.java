package AbstractionInterface;
import AbstractionInterface.Flight;

public class AirIndia implements Flight {

	@Override
	public void searchflights() {
		System.out.println("Hi Welcome To Air India");
		
	}

	@Override
	public void bookTicket() {

		System.out.println("Hi congrats Your ticket has been booked succesfully");

		
	}
	


}
