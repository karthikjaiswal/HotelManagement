package com.cg.hotel.dto;

public class CustomerDetails {

	private String custName,email,custAddress,roomType;
	private int roomNo;
	
	private long mobileNo;
	public CustomerDetails(String custName2, String email2, String custAddress2, long mobileNo2, int roomNo2,
			String roomType2) {
		this.custName=custName2;
		this.email=email2;
		this.custAddress=custAddress2;
		this.mobileNo=mobileNo2;
		this.roomNo=roomNo2;
		this.roomType=roomType2;
		
	}
	public CustomerDetails() {
		// TODO Auto-generated constructor stub
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
}
