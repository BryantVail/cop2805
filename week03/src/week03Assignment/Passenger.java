

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
  
  public boolean raiseAlert(boolean alertStatus){
    
    if(alertStatus == false){
      System.out.println("Raising the alert.");
      return true;
    }else{
      System.out.println("The Alert is already raised.");
     return true; 
    }
    
  }//end raiseAlert
  
  public boolean dropAlert(boolean alertStatus){
    //dropAlert
    if(alertStatus == false){
      System.out.println("alert is already dropped.");
      return false;
    }else{
      System.out.println("The alert has been dropped.");
     return false; 
    }
    
  }//end dropAlert
  
  
}//end class Passenger























