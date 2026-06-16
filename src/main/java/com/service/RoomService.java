package com.service;

import com.model.StudyRoom;
import com.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public void addRoom(String code, int capacity) {

        roomRepository.save(new StudyRoom(code, capacity));
    }

    public void displayRooms() {

        roomRepository.findAll().forEach(System.out::println);
    }
}