package com.hotelapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hotelapp.models.Address;
import com.hotelapp.models.Delivery;
import com.hotelapp.models.Hotel;
import com.hotelapp.models.Menu;
import com.hotelapp.service.DeliveryService;
import com.hotelapp.service.HotelService;
import com.hotelapp.service.MenuService;

@SpringBootApplication
public class SpringHotelappRestapiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringHotelappRestapiApplication.class, args);
	}
	
	@Autowired
	HotelService hotelService;
	@Autowired
	DeliveryService deliveryService;
	
	@Autowired
	MenuService menuService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Address address=new Address("ABC nagar",567890,"Banglore","KAR");
//		Menu menu1=new Menu("Paratha",20);
//		Menu menu2=new Menu("Pizza",120);
//		Set<Menu> menuList=new HashSet<>(Arrays.asList(menu1,menu2));
//		Delivery del1=deliveryService.getDeliveryByPartner("swiggy");
//		System.out.println(del1);
//		Set<Delivery> deliveryList=new HashSet<>(Arrays.asList(del1));
//		Hotel hotel =new Hotel("the A2B",address,menuList,deliveryList);
//		hotelService.addHotel(hotel);
		
		
//		Hotel hotel=hotelService.getHotelById(52);
//		System.out.println(hotel);
//		hotel.getAddress().setCity("Barnala");
//		hotelService.updateHotel(hotel);
//		hotel=hotelService.getHotelById(52);
//		System.out.println(hotel);
		
//		hotelService.getHotelsByCity("Barnala")
//					.stream()
//					.forEach((h)->System.out.println(h.getHotelName()+h.getAddress().getCity()));
//
//		System.out.println();
//		
//		hotelService.getHotelsByLocation("KAR")
//		.stream()
//		.forEach(System.out::println);
		
		
//		hotelService.getHotelsByMenu("Pizza")
//					.stream()
//					.forEach((h)->System.out.println(h.getHotelName()+"  "+h.getAddress().getStreetName()));
//		
//		System.out.println();
//		
//		hotelService.getHotelsByDelivery("uber")
//		.stream()
//		.forEach((h)->System.out.println(h.getHotelName()+"  "+h.getAddress().getStreetName()));
		
		
//		hotelService.getHotelsByLocationAndMenu("KAR", "Paratha");
		
		menuService.getMenusByHotel("A2B")
		.forEach((h)->System.out.println(h));
		
		
	}
	
	
	
	

}
