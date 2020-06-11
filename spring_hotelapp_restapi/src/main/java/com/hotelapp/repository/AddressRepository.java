package com.hotelapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hotelapp.models.Hotel;


@Repository
public interface AddressRepository extends JpaRepository<Hotel,Integer> {

}


//@Repository
//public interface AddressRepository extends JpaRepository<Student, Integer>{
//	
//   
//}