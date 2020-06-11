package com.hotelapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.hotelapp.models.Hotel;
import com.hotelapp.models.Menu;


@Repository
public interface MenuRepository extends JpaRepository<Menu,Integer> {

	//-------1------
	
	List<Menu> findByHotelHotelName(String hotelName);
	
	
	@Query("FROM Menu m INNER JOIN m.hotel h WHERE h.hotelName=?1")
	List<Menu> findByHotel(String hotelName);
//	
//	
	@Query(value="Select * from menu m inner join h on m.hotel_id=h.hotel_id where h.hotel_name=?1",nativeQuery=true)
	List<Menu> findByHotelNative(String hotelName);
}


//@Repository
//public interface AddressRepository extends JpaRepository<Student, Integer>{
//	
//   
//}