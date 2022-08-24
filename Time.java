package chapter06_exercise3;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public Time(){
	}
	public Time(int hour,int minute, int second) {
		if(hour < 23 && hour > 0) {
			this.hour = hour;
		}		
		if(minute < 59 && minute > 0) {
			this.minute = minute;
		}
		if(second < 59 && second > 0) {
			this.second = second;
		}
	}
	
	public String toString() { //기본적으로 가지고 있는 메소드
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}   // 문자열 반환
	
}
