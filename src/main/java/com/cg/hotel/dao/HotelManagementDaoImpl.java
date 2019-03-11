package com.cg.hotel.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.hotel.dto.CustomerDetails;
import com.cg.hotel.dto.RoomDetails;

public class HotelManagementDaoImpl implements HotelManagementDao{

	int count=1000;
	RoomDetails roomDetails=new RoomDetails();
	//CustomerDetails customerDetails=new CustomerDetails();
	Map<Integer,RoomDetails> roomMap;
	Map<Integer,CustomerDetails> customerMap=new HashMap<Integer, CustomerDetails>();;
	public HotelManagementDaoImpl()
	{
		roomMap=new HashMap<Integer, RoomDetails>();
		roomMap.put(101, new RoomDetails("AC_SINGLE"));
		roomMap.put(102, new RoomDetails("AC_SINGLE"));
		roomMap.put(103, new RoomDetails("AC_DOUBLE"));
		roomMap.put(201, new RoomDetails("NONAC_SINGLE"));
		roomMap.put(202, new RoomDetails("NONAC_SINGLE"));
		roomMap.put(203, new RoomDetails("NONAC_DOUBLE"));
	}
	public int bookCustomerRoom(CustomerDetails customerDetails) {
		
		int c=0;
		for(Map.Entry<Integer,RoomDetails> m: roomMap.entrySet())
		{
			if(m.getKey()==customerDetails.getRoomNo())
				roomDetails=m.getValue();
				if((roomDetails.getRoomType()).equals(customerDetails.getRoomType()))
					if(roomDetails.getStatus()=="Not Booked")
					{	roomDetails.setStatus("Booked");
						roomMap.put(customerDetails.getRoomNo(), roomDetails);
						++count;
						customerMap.put(count,new CustomerDetails(customerDetails.getCustName(),customerDetails.getEmail(),customerDetails.getCustAddress(),customerDetails.getMobileNo(),customerDetails.getRoomNo(),customerDetails.getRoomType()));
						c++;
						break;
					}
		}
		if(c==0)
			return 0;
		else
		return count;
		
	
	}
	
	public CustomerDetails viewCustomerDetails(int custId) {
		
		CustomerDetails customerDetails=null;
		for(Map.Entry<Integer, CustomerDetails> cEntry:customerMap.entrySet())
		{
			if(custId==cEntry.getKey())
			{
				customerDetails=cEntry.getValue();
				return customerDetails;
	
			}
			
			
		}
		return customerDetails;
		
	}
	
}
