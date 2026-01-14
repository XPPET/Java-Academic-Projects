
public class DataSet {
	
	private int counter;
	private double sum;
	private Measurable maximum;
	private Measurable minimum;
	
	public DataSet() {
		counter = 0;
		sum = 0;
		maximum = null;
		minimum = null;
	}
	
	public void add(Measurable item) {
		sum += item.getMeasure();
		if(counter == 0 || item.getMeasure() > maximum.getMeasure())
			maximum = item;
		if(counter == 0 || item.getMeasure() < minimum.getMeasure())
			minimum = item;
		
		counter++;
	}
	
	public double getAverage() {
		if(counter == 0)
			return 0;
		return sum/counter;
	}
	
	public Measurable getMaximum() {
		return maximum;
	}
	
	public Measurable getMinimum() {
		return minimum;
	}

}
