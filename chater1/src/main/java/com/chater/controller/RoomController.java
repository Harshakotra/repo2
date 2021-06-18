package com.chater.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.chater.model.Room;
import com.chater.service.RoomService;

@RestController
public class RoomController {
	//room service details
	@Autowired
	private RoomService roomService;
	
	@GetMapping("/room/{id}")
	public Optional<Room> getDetails(@PathVariable("id") int id){
		
		return roomService.getRoomDetails(id);

}
}