package Q7;

public class Customer  {
	int Customerid;
	String Customername;
	Long CustomerContact;
	Address adress;

	public int getCustomerid() {
		return Customerid;
	}

	public void setCustomerid(int customerid) {
		Customerid = customerid;
	}

	public String getCustomername() {
		return Customername;
	}

	public void setCustomername(String customername) {
		Customername = customername;
	}

	public Long getCustomerContact() {
		return CustomerContact;
	}

	public void setCustomerContact(Long customerContact) {
		CustomerContact = customerContact;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}


	public String custString() {
		return "Customer [Customerid=" + Customerid + ", Customername=" + Customername + ", CustomerContact="
				+ CustomerContact +" Adress="+ adress +"]";
	}
}