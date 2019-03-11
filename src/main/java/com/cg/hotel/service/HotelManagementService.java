package com.cg.hotel.service;

import com.cg.hotel.dto.CustomerDetails;

public interface HotelManagementService {

	int bookCustomerRoom(CustomerDetails customerDetails);
	CustomerDetails viewCustomerDetails(int custId);
}
