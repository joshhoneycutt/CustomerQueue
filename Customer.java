/*
	Program: CustomerQueue ~ Customer Class
	Summary: Creates a Customer object to be used in the line queue. Holds the serviceTime for each customer. 
	Functionality: 
		Constructor: Random ServiceTime (1-5)
		Public Methods: getServiceTime, newMinute
*/
	
import java.util.Random;		

public class Customer {
	
	private int serviceTime; 				// ServiceTime for this Customer
	
	/// Contructor
	public Customer() {										
		serviceTime = new Random().nextInt(5)+1;	// Randomly assign required service time 1-5
	}
	
	/// Getter for ServiceTime
	public int getServiceTime() {							
		return serviceTime;
	}
	
	/// Decrement ServiceTime by 1
	public void decServiceTime() {		
		serviceTime--;
	}
}
