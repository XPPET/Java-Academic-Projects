import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("John");
		Employee e2 = new Employee("Mary");
		Employee e3 = new Employee("Bob");
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		File file = new File("employee.ser");
		try {
			FileOutputStream fileOut = new FileOutputStream(file);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			
			out.writeObject(employees);
			
			out.close();
			fileOut.close();
			
			System.out.println("Employees have been written");
			
		} catch (FileNotFoundException exc1) {
			// TODO Auto-generated catch block
			exc1.printStackTrace();
		} catch (IOException exc1) {
			// TODO Auto-generated catch block
			exc1.printStackTrace();
		}
		
		try {
			FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            
            ArrayList<Employee> retrievedEmployees = (ArrayList<Employee>)in.readObject();
            
            in.close();
            fileIn.close();
            
            System.out.println("Employees retrieved: ");
            for(Employee e: retrievedEmployees)
            	System.out.println(e.getName());
            
		} catch (FileNotFoundException e11) {
			// TODO Auto-generated catch block
			e11.printStackTrace();
		} catch (IOException e11) {
			// TODO Auto-generated catch block
			e11.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
