package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
   
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;

    public Plane(int maxPassengers){
    	this.maxPassengers = maxPassengers;
    	this.passengers = new ArrayList<>();
    }
    
    public void onboard(String passenger) {
    	this.passengers.add(passenger);
    }
    
    public Date takeOff() {
    	return this.lastTimeTookOf = new Date();
    }
    
    public void land() {
    	this.lastTimeLanded = new Date();
		this.passengers.clear();
    }
    
    public Date getLastTimeLanded() {
    	return lastTimeLanded;
    }
    
    public List<String> getPassengers() {
    	return passengers;
    }
    
	public static void main(String[] args) {
		Plane plane = new Plane(20);

        plane.onboard("Mark");
        plane.onboard("Ahana");

        System.out.println("Plane took off at: " + plane.takeOff());

        System.out.println("People on the plane: " + plane.getPassengers());

        plane.land();

        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassengers());
    }
}
