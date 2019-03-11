package com.cg.hotel.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cg.hotel.dao.HotelManagementDaoImpl;
import com.cg.hotel.dto.CustomerDetails;
import com.cg.hotel.dto.RoomDetails;

class HotelManagementDaoImplTest {

	
	static CustomerDetails  c;
	static RoomDetails r;
	static HotelManagementDaoImpl h;
	@BeforeAll
	public static void init()
	{
		c=new CustomerDetails();
		r=new RoomDetails();
		h=new HotelManagementDaoImpl();
	}
	
	@Test
	void testBookCustomerRoom() {
		c.setCustName("karthik");
		c.setEmail("kar@gmail");
		c.setCustAddress("hyd");
		c.setMobileNo(98654565);
		c.setRoomNo(101);
		c.setRoomType("AC_SINGLE");
		
		assertEquals(1001, h.bookCustomerRoom(c));
		
	}
	
	@Test
	void testViewCustomerDetails()
	{
		c=h.viewCustomerDetails(1001);
		assertEquals("karthik", c.getCustName());
	}

}
