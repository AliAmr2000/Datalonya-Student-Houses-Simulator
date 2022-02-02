import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Dorm {
	ArrayList <House> houseList = new ArrayList <House>();
	ArrayList <Student> studentList = new ArrayList <Student>();
	ArrayList <Student> deniedStudentsList = new ArrayList <Student>();
	/**
	 * Allocating students according to their ratings and priority based on their IDs
	 */
	public void allocateHouses() {
		Collections.sort(houseList);
		Collections.sort(studentList);
		while (studentList.isEmpty() == false) {
			for (Student std : studentList) {
				for (House house : houseList ) {
					if (house.duration == 0 && house.rating>= std.rating) {
						house.setDuration(std.duration);
						std.occupationStatus = true;
						break;
					}
				}
			}
			addDeniedStudents();

		}
		
	}
	/**
	 * Eliminating Students who are about to graduate or who were already placed to dorms
	 */
	public void addDeniedStudents() {
		Iterator <Student> itr = studentList.iterator();
		while (itr.hasNext()) {
			Student std = itr.next();
			if (std.duration == 0) {
				deniedStudentsList.add(std);
				itr.remove();
			}
			else if(std.occupationStatus == true) {
				itr.remove();
			}
			else {
				std.decrementDuration();
			}
		}
		for (House house : houseList) {
			if (house.duration != 0) {
				house.decrementDuration();
			}
		}
	}
}
