package Q1;

public class Customer {
	
	private int custID;
	private String custName;
	private int custNumber;
	private Address custAddress;
	
	
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getCustNumber() {
		return custNumber;
	}
	public void setCustNumber(int custNumber) {
		this.custNumber = custNumber;
	}
	public Address getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(Address custAddress) {
		this.custAddress = custAddress;
	}
	public void displayInfo() {
		System.out.println("custID: " + getCustID() + "\ncustName: " + getCustName()
		+ "\ncustNumber: " + getCustNumber());
		System.out.println("Address:( Street :" + getCustAddress().getStreet() 
				+ ", City :" + getCustAddress().getCity()
				+ ", State :" + getCustAddress().getState()
				+ ", Country :" + getCustAddress().getCountry()
				+ ", Zip :" + getCustAddress().getZip() + ")");
		
	}

}
