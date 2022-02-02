import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Collections;
import java.util.Scanner;
public class project1main {

	public static void main(String[] args) throws FileNotFoundException {
      Scanner in = new Scanner(new File (args[0]));
      PrintStream out = new PrintStream(new File (args[1]));
      
      Dorm datalonya = new Dorm();
      // Reading the entries in the file
      while(in.hasNext()) {
    	  if (in.next().equals("h")) 
    		  datalonya.houseList.add(new House(in.nextInt(),in.nextInt(),in.nextDouble()));
    	  else
    		  datalonya.studentList.add(new Student(in.nextInt(),in.next(),in.nextInt(),in.nextDouble()));
      }
      //Allocating available places to students
      datalonya.allocateHouses();
      Collections.sort(datalonya.deniedStudentsList);
		for (Student std : datalonya.deniedStudentsList) {
			out.print(std+"\n");
		}
      in.close();
      out.close();
	}

}
