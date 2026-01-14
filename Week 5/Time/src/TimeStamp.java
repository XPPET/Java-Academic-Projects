
public class TimeStamp {
	
	private int second;
	private int minute;
	private int hour;
	
	public TimeStamp(int h, int m, int s) {
		hour = h;
		minute = m;
		second = s;
	}
	
	public void increaseHour() {
		hour++;
		if(hour == 24)
			hour = 0;
	}
	
	public void printTime() {
		System.out.println("Time is: " + hour + ":" + 
	                        minute + ":" + second);
	}
}
