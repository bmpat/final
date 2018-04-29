/**
 *
 */

/**
 * @author Brandon Patrick
 */

public class Main {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		GymClass class1 = new GymClass(1,"Mr. Smith", "Jazz Hands");//creating the gym classes
		GymClass class2 = new GymClass(2,"Mr. Doe", "Hide & Seek");
		GymClass class3 = new GymClass(3,"Ms. Jones", "Weight Lifting");
		
		Customer cust1 = new Customer(1,"Billy Bob","1@na.com");//adding members
		Customer cust2 = new Customer(2,"Jimmy John","2@na.com");
		Customer cust3 = new Customer(3,"Tilly Tom","3@na.com");
		Customer cust4 = new Customer(4,"Chilly Chill","4@na.com");
		Customer cust5 = new Customer(5,"Bleh Blah","5@na.com");
		
		LinkList gymList = new LinkList<GymClass>();//adding gyms to the gymlist
		gymList.addFirst(class1);
		gymList.addFirst(class2);
		gymList.addFirst(class3);
		
		LinkList customerList = new LinkList<Customer>(); //adding customers to the customer list
		customerList.addFirst(cust1);
		customerList.addFirst(cust2);
		customerList.addFirst(cust3);
		customerList.addFirst(cust4);
		customerList.addFirst(cust5);
		
		System.out.println("Listing all Gym Classes:");
		System.out.println("------------------------");
		gymList.display(); // displaying both
		System.out.println("Listing all customers:");
		System.out.println("------------------------");
		customerList.display();
		
		class1.addCustomer(cust1); // enrolling customers to different gym classes
		class1.addCustomer(cust2);
		class2.addCustomer(cust3);
		class3.addCustomer(cust4);
		class3.addCustomer(cust5);
		
		
		System.out.println("Current Customers enrolled in Jazz Hands:");// showing who's enrolled in each gym class
		System.out.println("-----------------------------------------");
		class1.displayEnrolled(); 
		System.out.println("Current Customers enrolled in Hide & Seek:");
		System.out.println("------------------------------------------");
		class2.displayEnrolled();
		System.out.println("Current Customers enrolled in Weight Lifting:");
		System.out.println("---------------------------------------------");
		class3.displayEnrolled();
		
			}
}
