package activities;

public class Activity7 {
	
	public static void main(String[] args) {
		MountainBike mb = new MountainBike(5, 1, 30);
	    System.out.println(mb.bicycleDesc());
	    mb.speedUp(30);
	    mb.applyBrake(3);
	}
}
	interface BicycleParts {
		public static final int gears = 0;
		public static final int speed = 0;
	}
	
	interface BicycleOperations{
		abstract void applyBrake(int decrement);
		abstract void speedUp(int increment);
	}
	
	class Bicycle implements BicycleParts, BicycleOperations {

		public int gears;
		public int currentSpeed;
		
		public Bicycle(int gears, int currentSpeed) {
	        this.gears = gears;
	        this.currentSpeed = currentSpeed;
	    }
		
		@Override
		public void applyBrake(int decrement) {
			currentSpeed = currentSpeed - decrement;
			System.out.println("CurrentSpeed is: "+currentSpeed);
		}

		@Override
		public void speedUp(int increment) {
			currentSpeed = currentSpeed + increment;
			System.out.println("CurrentSpeed is: "+currentSpeed);
		}
		
		public String bicycleDesc() {
	        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
	    }
	}
    
	class MountainBike extends Bicycle{

	    public int seatHeight;

	    public MountainBike(int gears, int currentSpeed, int startHeight) {
	        super(gears, currentSpeed);
	        seatHeight = startHeight;
	    }

	    public void setHeight(int newValue) {
	        seatHeight = newValue;
	    }

	    public String bicycleDesc() {
	        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
	    }
	}
	




	
