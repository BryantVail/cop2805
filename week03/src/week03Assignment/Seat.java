
public class Seat{
	
	public String 	Row;
	public int		seatNumber;
	public boolean	alert;
	
	public void toggleAlert(){
		
		if(this.alert == true) {
			this.alert = false;
		}else {
			
			
			this.alert =  false;
			
		}
		
	}
	
	public void setSeatNumber(int seatNumber){
		if(seatNumber <=1 && seatNumber <5){
			this.seatNumber = seatNumber;
		}else{
			//throw exception
		}
	}
	
}






