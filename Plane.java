package chapter06_exercise3;

public class Plane {
	private String manufacture;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes ;
	
	public Plane(){
		numberOfPlanes++;
	}
	public Plane(String manufacture,String model,int maxNumberOfPassengers){
		this();
		this.manufacture = manufacture;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}
	
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacturer(String manufacture) {
		this.manufacture = manufacture;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxNumberOfPasssengers() {
		return maxNumberOfPassengers;
	}
	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if(maxNumberOfPassengers>0){
			this.maxNumberOfPassengers = maxNumberOfPassengers;
		}
		
	}
	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}
	
	
	
}
