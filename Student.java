
public class Student implements Comparable<Student>{
	int ID;
	String name;
	int duration;
	double rating;
	boolean occupationStatus;
	public Student (int ID, String name , int duration , double rating) {
		this.ID = ID;
		this.name = name;
		this.duration = duration;
		this.rating = rating;
		this.occupationStatus = false;
	}
	/**
	 * compareTo method for sorting students according to their IDs
	 */
	public int compareTo(Student other) {
		return this.ID - other.ID;
	}
	/**
	 * Printing the names of students
	 */
	public String toString() {
		return this.name;
	}
	/**
	 * Decreasing the duration till the graduation after every semester
	 */
	public void decrementDuration() {
		this.duration--;
	}
	/**
	 * Obtaining the duration to check whether the student is about to graduate or not 
	 * @return
	 */
	public int getDuration() {
		return this.duration;
	}
}
