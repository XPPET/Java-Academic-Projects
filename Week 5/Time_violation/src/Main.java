
public class Main {

	public static void main(String[] args) {
		
		TimeStamp t1 = new TimeStamp(23, 55, 17);
		t1.printTime();
		
		//Η απευθείας πρόσβαση στις ιδιότητες του αντικειμένου
		//οδηγεί σε δημιουργία μή-έγκυρων αντικειμένων
		//όπου παραβιάζεται αναλλοίωτη συνθήκη (0<=hour<24)
		t1.hour++;
		t1.hour++;
		
		t1.printTime();
		
	}

}
