package com.cg.hotel.dto;

public class RoomDetails {

	private String roomType;
	private String status="Not Booked";
	public RoomDetails(String roomType) {
		this.roomType=roomType;
	}
	public RoomDetails() {
		
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
