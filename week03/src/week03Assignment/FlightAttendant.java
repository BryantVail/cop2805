package week03Assignment;

import java.util.ArrayList;

public class FlightAttendant implements IAlertRaiserAdmin {
	
	private String firstName;
	private String lastName;
	
	ArrayList<Seat> seats = new ArrayList<Seat>();
	
	public FlightAttendant() {
		this.firstName = "";
		this.lastName = "";
	}
	
	private void initialize(Seat[] seats) {
		
	}

}
