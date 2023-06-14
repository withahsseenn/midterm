import java.util.Set;

public class Car implements CarbonFootprint{

	//We found the carbon foot of the car.
	private static double FOOTPRINT_PER_MILE_PER_GALLON = .0846;
	
	private String id;
	private double miles;
	private double milespergallon;
	
	public Car(String id,double miles,double milespergallos) {
		setId(id);
		setMiles(miles);
		setMilespergallon(milespergallos);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getMiles() {
		return miles;
	}

	public void setMiles(double miles) {
		this.miles = miles;
	}

	public double getMilespergallon() {
		return milespergallon;
	}

	public void setMilespergallon(double milespergallon) {
		this.milespergallon = milespergallon;
	}
	
	public double getCarbonFootprint() {
		return((FOOTPRINT_PER_MILE_PER_GALLON *getMiles())/getMilespergallon());
	}
	//our printing code
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(getId());
		string.append("\nMiles Traveled: " + getMiles());
		string.append("\nMiles per gallon: " + getMilespergallon());
		return string.toString();
	}
}
