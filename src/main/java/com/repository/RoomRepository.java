package com.repository;

import com.model.StudyRoom;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RoomRepository {

    private List<StudyRoom> rooms = new ArrayList<>();

    public void save(StudyRoom room) {

        rooms.add(room);
    }

    public List<StudyRoom> findAll() {

        return rooms;
    }
}