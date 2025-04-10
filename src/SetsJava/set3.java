// Set 3: Vehicle Speed Monitoring System
// Interface SpeedMonitor → Contains method check_speed().
// Class Vehicle (Base Class) → Attributes: model, registrationNumber, speed.
// Class Car (Child Class) → Extends Vehicle, implements SpeedMonitor.
// User-Defined Exception: OverSpeedException if speed > 120 km/h.

class OverSpeedException extends Exception{
	OverSpeedException(String message){
		super(message);
	}
}

interface SpeedMonitor{
	void check_speed() throws OverSpeedException;
}

class Vehicle{
	String Model;
	int registrationNumber,speed;

	Vehicle(String Model,int registrationNumber,int speed){
		this.Model = Model;
		this.registrationNumber = registrationNumber;
		this.speed = speed;
	}
	
	void displayDetails(){
		System.out.println("Model = " + this.Model);
		System.out.println("RegistrationNumber = " + this.registrationNumber);
		System.out.println("speed = " + this.speed);
	}
}

class Car extends Vehicle implements SpeedMonitor{
	Car(String Model,int registrationNumber,int speed){
		super(Model,registrationNumber,speed);
	}
	
	public void check_speed() throws OverSpeedException{
		if(speed > 120){
			throw new OverSpeedException("Speed Limit 120");
		}else{
			displayDetails();
		}
	}
}

public class set3{
	public static void main(String args[]){
		try{
			Car c1 = new Car("Alto",121,100);
			Car c2 = new Car("URUS",124,130);
	
			c1.check_speed();
			c2.check_speed();
		}catch(OverSpeedException e){
			System.out.println("Exception : " + e);
		}
	}
}
	
	