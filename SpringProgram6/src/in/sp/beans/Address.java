package in.sp.beans;

public class Address {
	private int houseno;
	private String city;
	private int pincode;
	
	public Address(int houseno,String city,int pincode) {
		this.houseno=houseno;
		this.city=city;
		this.pincode=pincode;
	}
	public int getHouseno() {
		return houseno;
	}
	
	public String getCity() {
		return city;
		
	}
	
	public int getPincode() {
		return pincode;
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
