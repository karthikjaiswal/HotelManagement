package com.cg.hotel.dao;

import com.cg.hotel.dto.CustomerDetails;

public interface HotelManagementDao {
	
	int bookCustomerRoom(CustomerDetails customerDetails);
	
	CustomerDetails viewCustomerDetails(int custId);
	
}
