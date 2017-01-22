public class Employee {
	private int eNum;
	private Name name;
	private Address address;
	private Date hireDate;
	
	
	public Employee(){
		
	}
	
	public Employee(int eNum, Name name, Address address, Date hireDate) {
		this.eNum = eNum;
		this.name = name;
		this.address = address;
		this.hireDate = hireDate;
	}
	
	public int geteNum() {
		return eNum;
	}
	public void seteNum(int eNum) {
		this.eNum = eNum;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	
	

}
