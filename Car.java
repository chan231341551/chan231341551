package chapter06_exercise3;

public class Car {
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200/1.6;
	
	public Car(){
		
	}
	public Car(String color){
		this.color = color;
	}
	
	public double getSpeed() {
		
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static double getMaxSpeed() {
		return MAX_SPEED;
	}
	public boolean speedUp(double speed) {
		if(speed < 0 || speed > MAX_SPEED) {
			this.speed = 0;
			return false;
		}
		else {
			this.speed += speed;
			return true;
		}
	}
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", color=" + color + "]";
	}
	
	
	
}
