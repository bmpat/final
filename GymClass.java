/**
 * @author Brandon Patrick
 */
import java.util.Objects;

public class GymClass {
	private Integer id;
	private String instructor;
	private String name;
	
	private LinkList<Customer> enrolled = new LinkList<>(); // creates new list for the people enrolled in the gym classes
	
	public GymClass(Integer id, String instructor, String name) { // constructor
		this.id = id;
		this.instructor = instructor;
		this.name = name;
	}
	
	public void displayEnrolled(){ // displays enrolled members
		enrolled.display();
	}
	
	public void addCustomer(Customer customer){ // lets us add people to classes
		enrolled.addFirst(customer);
	}

	public Integer getId() {//setters and getters
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getInstructor() {
		return instructor;
	}
	
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Id: " + id + " - Instructor: " + instructor + " - Name: " + name;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		GymClass gymClass = (GymClass) o;
		return Objects.equals(id, gymClass.id);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
