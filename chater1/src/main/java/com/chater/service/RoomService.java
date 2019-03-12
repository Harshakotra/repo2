package com.chater.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chater.model.Room;
import com.chater.repository.RoomRepository;

@Service
public class RoomService {
	@Autowired
	RoomRepository roomRepository;

	public Optional<Room> getRoomDetails(int id) {
		// TODO Auto-generated method stub
		
		return roomRepository.findById(id);
	}

}
