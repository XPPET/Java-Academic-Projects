
public class GraduateStudent extends Student {
	
	private String supervisor;

	public GraduateStudent(String aName, String someId, String supervisor) {
		super(aName, someId);  //κλήση του κατασκευαστή υπερκλάσης
		this.supervisor = supervisor;
	}
	
	//επικάλυψη μεθόδου
	public void printInfo() {
		super.printInfo();
		System.out.println("Supervisor: " + supervisor);
	}
	

}
