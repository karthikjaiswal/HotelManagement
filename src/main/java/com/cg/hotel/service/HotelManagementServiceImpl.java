package com.cg.hotel.service;

import com.cg.hotel.dao.HotelManagementDao;
import com.cg.hotel.dao.HotelManagementDaoImpl;
import com.cg.hotel.dto.CustomerDetails;

public class HotelManagementServiceImpl implements HotelManagementService{

	HotelManagementDao hotelManagementDao=new HotelManagementDaoImpl();
	
	public int bookCustomerRoom(CustomerDetails customerDetails) {

		
		return hotelManagementDao.bookCustomerRoom(customerDetails);
	}

	public CustomerDetails viewCustomerDetails(int custId) {
		
		
		return hotelManagementDao.viewCustomerDetails(custId);
		
	}

}
