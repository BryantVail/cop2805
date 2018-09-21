

public class Passenger implements IAlertRaiser{
  
  private String firstname;
  private String lastname;
  private String departureLocation;
  private Seat seat;
  
  public boolean toggleAlert(boolean alertStatus){
    
    if(alertStatus == false){
      return true;
    }else{
     return false; 
    }
    
  }//end toggleAlert
  
  
}//end class Passenger























