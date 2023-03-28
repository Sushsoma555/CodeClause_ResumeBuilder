package resumeBuilder.model;

public class Header {
	private String name;
	private String address;
	private String emailAddress;
	private String phoneNumber;


	@Override
	public String toString() {
		return "Header [name=" + name + ", address=" + address + ", emailAddress=" + emailAddress + ", phoneNumber="
				+ phoneNumber +  "]";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}