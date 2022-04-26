package Q7;

public class Address {
	String street;
	String city;
	String state;
	String zip;
	String country;
	public Address(String street, String city, String state, String zip, String country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	public String addressString() {
		return "Adress [street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country="
				+ country + "]";
	}	
}