
public class House implements Comparable<House> {
	int ID;
	int duration;
	double rating;
	public House (int ID, int duration, double rating) {
		this.ID = ID;
		this.duration = duration;
		this.rating = rating;
	}
	/**
	 * Sorting Houses according to their IDs
	 */
	public int compareTo(House other) {
		return this.ID - other.ID;
	}
	/**
	 * Decrementing the duration till vacancy of the house following the placement of a student
	 */
	public void decrementDuration() {
		this.duration --;
	}
	/**
	 * Setting the Duration till vacancy of the house according to the graduation duration of the placed student
	 * @param duration
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
}
