package com.cg.hotel.exceptions;

public class InvalidRoomNumberException extends Exception{

	public InvalidRoomNumberException()
	{
		System.out.println("Room number does not exists and Invalid room type");
	}
}
