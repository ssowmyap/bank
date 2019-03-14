package com.capg.Banking;

public class AccountDetails {

	private String FirstName;
	private String LastName;
	private String EmailId;
	private String passward;
	private int PancardNo;
	private int AadharcardNo;
	private String Address;
	private long MobileNo;
	private int Balance;
	private int AmountTransfered;
	private int fromAccountNo;
	private int ToAccountNo;
	private int AccountNo;
	
	public int getAmountTransfered() {
		return AmountTransfered;
	}
	public void setAmountTransfered(int amountTransfered) {
		AmountTransfered = amountTransfered;
	}
	public int getFromAccountNo() {
		return fromAccountNo;
	}
	public void setFromAccountNo(int fromAccountNo) {
		this.fromAccountNo = fromAccountNo;
	}
	public int getToAccountNo() {
		return ToAccountNo;
	}
	public void setToAccountNo(int toAccountNo) {
		ToAccountNo = toAccountNo;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	public int getPancardNo() {
		return PancardNo;
	}
	public void setPancardNo(int pancardNo) {
		PancardNo = pancardNo;
	}
	public int getAadharcardNo() {
		return AadharcardNo;
	}
	public void setAadharcardNo(int aadharcardNo) {
		AadharcardNo = aadharcardNo;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	public int getAccountNo() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	
}
