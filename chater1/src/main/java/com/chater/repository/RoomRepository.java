package com.chater.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.chater.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room,Integer>{
	

}
