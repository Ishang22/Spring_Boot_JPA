package com.hotelapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.models.Hotel;
import com.hotelapp.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	HotelRepository hotelrepositry;	
	
	@Override
	public Hotel addHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		 return hotelrepositry.save(hotel);	

	}

	@Override
	public Hotel updateHotel(Hotel hotel) {
		// TODO Auto-generated method stub
			return hotelrepositry.save(hotel);	
	}

	@Override
	public Hotel getHotelById(int hotelId) {
		
		return hotelrepositry.findById(hotelId).get();
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteHotel(int hotelId) {
		hotelrepositry.deleteById(hotelId);	
		// TODO Auto-generated method stub

	}

	@Override
	public List<Hotel> getHotelsByCity(String city) {
		// TODO Auto-generated method stub
		return hotelrepositry.findByAddressCity(city);
	}

	@Override
	public List<Hotel> getHotelsByMenu(String menuName) {
		// TODO Auto-generated method stub
		System.out.println("=====menuName====menuName===="+menuName);
		return hotelrepositry.findHotelsByMenu(menuName);
	}

	@Override
	public List<Hotel> getHotelsByDelivery(String partnerName) {
		// TODO Auto-generated method stub
		return hotelrepositry.findHotelsByDelivery(partnerName);
	}

	@Override
	public List<Hotel> getHotelsByLocation(String location) {
		// TODO Auto-generated method stub
		return hotelrepositry.findByAddressStreetName(location);
	}

	@Override
	public List<Hotel> getHotelsByLocationAndMenu(String location, String menuName) {
		// TODO Auto-generated method stub
		return getHotelsByLocationAndMenu(location,menuName);
	}

}
