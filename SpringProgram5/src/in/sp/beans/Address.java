package in.sp.beans;

public class Address {
	private int houseno;
	private String city;
	private int pincode;
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
		System.out.println("Setter Method Called");
	}
	public String getCity() {
		return city;
		
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "#"+houseno+","+city+","+pincode;
	}
	public void display() {
		System.out.println("HouseNo : "+houseno);
		System.out.println("City : "+city);
		System.out.println("Pin : "+pincode);
	}

}
