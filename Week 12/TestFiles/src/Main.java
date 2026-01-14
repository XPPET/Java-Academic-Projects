import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Mary");
		names.add("Helen");
		names.add("Nick");
		names.add("Jack");
			
		try
		{
			File f = new File("newFile.txt");
			FileWriter writer = new FileWriter(f);
			
			for(String name: names) {
			  writer.write(name);
			  writer.write(System.lineSeparator());
			}
			
			writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		//GUI gui = new GUI();
	}

}
