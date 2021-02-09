package assign;

import assign.Address.Customer;

class Address
	{
		private String addressLine;
		private String city;

	public Address(String addressLine, String city) {

			this.addressLine = addressLine;
			this.city = city;
		}
	
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

    public String getAddressLine() {
		return addressLine;
	}

     public String getCity() {
		return city;
	}

    public void setCity(String city) {
		this.city = city;
	}
    public String getAddressDetails()
    {
    	return "addressLine" + " " + "city"; //returns string with address details
    }

class Customer
{
	private String name;
	private Address address;
	
	public Customer(String string, Address address2) {
		// TODO Auto-generated constructor stub
	}

	public void Customer(String name , Address address){
		this.name=name;
		this.address= address;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address.getAddressLine() + " "+ address.getCity();
	}

	public String getCustomerDetails()
    {
    	return "Customer :" + name + "\n residential Address :" + address.getAddressLine() + " " +address.getCity();
    }
}
}
public class TestCustomer {
    public static void main (String[] args) {
	
	Address address = new Address ("Ist Main HSR Layout", "Banglore");
	
	Customer customer = new Customer ("Kanchan" , address);
	
	customer.setName(" Kanchan");
	customer.setAddress(address);
	
	System.out.println("Customer" + customer.getName());
	System.out.println("residential address" + customer.getAddress());
	
	System.out.println(customer.getCustomerDetails());
	
}
}