
public class TimeStamp {
	
	//Παραβίαση της αρχής της ενσωμάτωσης
	public int second;
	public int minute;
	public int hour;
	
	public TimeStamp(int h, int m, int s) {
		hour = h;
		minute = m;
		second = s;
	}
		
	public void printTime() {
		System.out.println("Time is: " + hour + ":" + 
	                        minute + ":" + second);
	}
}
