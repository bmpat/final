/**
 * @author Brandon Patrick
 */
import java.util.Objects;

public class Customer {
	private Integer id;
	private String name;
	private String email;
	
	
	public Customer(Integer id, String name, String email) { // constructor
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Integer getId() { // setters and getters
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "ID: " + id + " - Name: " + name+ " - Email: " + email;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Customer customer = (Customer) o;
		return Objects.equals(id, customer.id);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
