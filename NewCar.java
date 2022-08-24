package chapter06_exercise3;

public class NewCar {
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200/1.6;
	
	//기본생성자
	public NewCar(){
		
	}
	//색상세팅 생성자
	public NewCar(String color){
		this.color = color;
	}
	
	public double getSpeed() {
		return killoToMile(speed);
	}
	public void setSpeed(double speed) {
		this.speed = killoToMile(speed);
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
		if(this.speed < 0 || this.speed > MAX_SPEED) {
			this.speed = 0;
			return false;
		}
		else {
			this.speed += speed;
			return true;
		}
	}
	//km -> mile
	private static double killoToMile(double distance) {
		return distance/1.6;
	}
	//mile ->km
	private static double MileTokillo(double distance) {
		return 1.6*distance;
	}
	@Override
	public String toString() {
		return "NewCar [speed=" + speed + ", color=" + color + "]";
	}
	
}
