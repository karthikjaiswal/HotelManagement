package com.cg.hotel;

import java.util.Scanner;

import com.cg.hotel.dto.CustomerDetails;
import com.cg.hotel.exceptions.InvalidCustomerIdException;
import com.cg.hotel.exceptions.InvalidRoomNumberException;
import com.cg.hotel.service.HotelManagementService;
import com.cg.hotel.service.HotelManagementServiceImpl;

public class Hotel 
{
    public static void main( String[] args )
    {
    	CustomerDetails customerDetails=new CustomerDetails();
    	HotelManagementService hotelManagementService=new HotelManagementServiceImpl();
    	Scanner scanner=new Scanner(System.in);
        while(true)
        {
        	System.out.println("==========Hotel Management========");
        	System.out.println("1. Book Room \n2. View Booking Status \n3. Exit");
        	int choice=scanner.nextInt();
        	switch(choice)
        	{
        		case 1:
        			System.out.println("Enter Customer Name:");
        			customerDetails.setCustName(scanner.next());
        			System.out.println("Enter Email:");
        			customerDetails.setEmail(scanner.next());
        			System.out.println("Enter Customer Address:");
        			customerDetails.setCustAddress(scanner.next());
        			System.out.println("Enter Mobile No:");
        			customerDetails.setMobileNo(scanner.nextLong());
        			System.out.println("Enter Room No");
        			customerDetails.setRoomNo(scanner.nextInt());
        			System.out.println("Enter Room Type");
        			customerDetails.setRoomType(scanner.next());
        			
        			int cust=hotelManagementService.bookCustomerRoom(customerDetails);
        			if(cust!=0)
        			{
        				System.out.println("Your room has been successfully booked, your customer id: "+cust);
        			}
        			else
        			{
        				try {
							throw new InvalidRoomNumberException();
						} catch (InvalidRoomNumberException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
        				
        			}
        			
        			break;
        		case 2:
        			System.out.println("Enter Customer ID: ");
        			int custId=scanner.nextInt();
        			
        			CustomerDetails view=hotelManagementService.viewCustomerDetails(custId);
        			if(view!=null)
        			{
							System.out.println("Name of customer: "+view.getCustName());
							System.out.println("Booking Status: Booked");
							System.out.println("Room No: "+view.getRoomNo());
							System.out.println("Room Type: "+view.getRoomType());
        			}
        			else
        			{
        				try {
							throw new InvalidCustomerIdException();
						} catch (InvalidCustomerIdException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
        			}
        			break;
        		case 3:
        			scanner.close();
        			System.exit(0);
        			break;
        	}
        }
    }
}
