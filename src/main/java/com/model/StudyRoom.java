package com.model;

public class StudyRoom {

    private String roomCode;
    private int capacity;

    public StudyRoom(String roomCode, int capacity) {
        this.roomCode = roomCode;
        this.capacity = capacity;
    }

    public String getRoomCode() {

        return roomCode;
    }

    public int getCapacity() {

        return capacity;
    }

    @Override
    public String toString() {

        return roomCode + " | Capacity: " + capacity;
    }
}